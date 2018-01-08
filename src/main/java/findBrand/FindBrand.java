package findBrand;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindBrand {
	@Test

	public void sunGlass() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/women-sunglasses"); TimeUnit.SECONDS
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> classes = driver.findElementsByXPath("//span[@class='product-discountPercentage']");	//fetching all percentages
	//	System.out.println(classes.size());


		int i=0;
		for (WebElement eachClass : classes) {

			if(eachClass.getText().contains("(50% OFF)")){
				System.out.println(driver.findElementByXPath("(//span[@class='product-discountPercentage'])["+i+"]/preceding::div[1]").getText());//incrementing the index no. and taking brand
			}
			i++;
		}

	}
}