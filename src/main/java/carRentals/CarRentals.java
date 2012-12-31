package carRentals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CarRentals {
	@Test
	public void Cars(){
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.savaari.com/select_cars.php?from_city=Bangalore%2C+Karnataka&from_city_dummy=377&one_way_start_city_dummy=&one_way_start_city=&one_way_end_city_dummy=&one_way_end_city=&to_city_dummy%5B%5D=1222&to_city_1%5B%5D=Mysore%2C+Karnataka&trip_sub_type=8&pickup_date=29-12-2017&pickup_time=16%3A45&drop_date=29-12-2017&duration=1&trip_type=3&itinerary_km=0");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		List<WebElement> classes = driver.findElementsByXPath("//strong[contains(text(),'Toyota')]");
		
	
		
		
	}

}
