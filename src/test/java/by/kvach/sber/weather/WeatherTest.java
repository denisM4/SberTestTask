package by.kvach.sber.weather;

import by.kvach.sber.task2.api.WeatherController;
import by.kvach.sber.task2.api.dto.ResponseWeather;
import by.kvach.sber.task2.steps.WeatherSteps;

import org.testng.annotations.Test;

public class WeatherTest {
	WeatherSteps weatherSteps = new WeatherSteps();
	WeatherController weatherController = new WeatherController();

	private final static String PATH = "/current.json";

	@Test(description = "Weather positive test")
	public void weatherPositiveTest() {
		weatherSteps.checkCityTemp("Minsk", 35);
		weatherSteps.checkCityTemp("Gdansk", 20);
		weatherSteps.checkCityTemp("Gomel", 15);
		weatherSteps.checkCityTemp("Brest", 22);
	}

	@Test(description = "Weather negative test")
	public void weatherNegativeTest() {
		weatherSteps.checkErrorCode(weatherController.getToWeather(PATH,"Misksd" ), "No location found matching parameter 'q'", 1006);
		weatherSteps.checkErrorCode(weatherController.getToWeather(PATH,"" ), "Parameter 'q' not provided.", 1003);
		weatherSteps.checkErrorCode(weatherController.getToWeather(PATH,"Misk", "0" ), "API key has been disabled.", 2008);
		weatherSteps.checkErrorCode(weatherController.getToWeather(PATH + 123,"Minsk" ), "API request url is invalid.", 1005);
	}
}
