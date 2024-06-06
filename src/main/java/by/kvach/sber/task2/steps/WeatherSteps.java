package by.kvach.sber.task2.steps;

import static by.kvach.sber.task2.config.Logger.report;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import by.kvach.sber.task2.api.WeatherController;
import by.kvach.sber.task2.api.dto.ResponseWeather;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import org.testng.Assert;

public class WeatherSteps {

	private WeatherController weatherController = new WeatherController();

	private final static String PATH = "/current.json";

	@Step("Сравниваем температуру в городе {0} с ожидаемой - {1}")
	public void checkCityTemp(String city, int temp) {
		ResponseWeather responseWeather = weatherController.getToWeather(PATH, city)
				.as(ResponseWeather.class);
		int currentTemp = responseWeather.getCurrent().getTemp_c();
		assertEquals(currentTemp, temp,
				"Температура в городе " + city + " отличается от ожидаемой на " + (currentTemp - temp));
		report("Разница температур - " + (currentTemp - temp));
	}

	@Step("Проверяем код ошибки {2} и сообщения - {1}")
	public void checkErrorCode(Response response, String message, int code) {
		String errorMessage = response.getBody().jsonPath().get("error.message");
		int errorCode = response.jsonPath().getInt("error.code");

		assertEquals(errorCode, code, "Код ошибке не совпадает");
		assertEquals(errorMessage, message, "Сообщение об ошибке не совпадает");
	}
}
