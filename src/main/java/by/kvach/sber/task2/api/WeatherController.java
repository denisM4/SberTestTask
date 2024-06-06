package by.kvach.sber.task2.api;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

import by.kvach.sber.task2.api.dto.ResponseWeather;
import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WeatherController {

	private final static String apiKey = "e5aa64be78ba4670b1e95320240606";

	private RequestSpecification getSpec() {
		return given()
				.baseUri("https://api.weatherapi.com/v1")
				.param("lang", "en")
				.filter(new AllureRestAssured());
	}

	@Step("Получаем погоду для города - {1}")
	public Response getToWeather(String path, String city, String... key) {
		String apiKey = key.length==0 ? WeatherController.apiKey : key[0];
		return given()
				.contentType(JSON)
				.spec(getSpec())
				.param("key", apiKey)
				.param("q", city)
				.basePath(path)
				.header("Accept", "application/json")
				.when().get().then()
				.log().all()
				.extract().response();
	}
}
