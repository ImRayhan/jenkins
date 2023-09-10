

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example {
	WebDriver driver;

	@Test
	public void name() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		List<WebElement> multifleCart = driver
				.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));

		for (WebElement iterable_element : multifleCart) {
			iterable_element.click();

		}

	}

}
