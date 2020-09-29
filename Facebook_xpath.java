package homework_day13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_xpath {
	public static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		/*
		 * WebElement create_account = driver.findElement(By.id("u_0_2")); Actions
		 * moushover=new Actions(driver);
		 * moushover.moveToElement(create_account).click().build().perform();
		 */Thread.sleep(1000);

		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("u_2_b")).sendKeys("Shamsul");
		Thread.sleep(1000);
		driver.findElement(By.id("u_2_d")).sendKeys("Khan");
		Thread.sleep(1000);
		driver.findElement(By.id("u_2_g")).sendKeys("123456789");

		// driver.findElement(By.id("u_2_j")).sendKeys("keramotali@gmail.com");

		Thread.sleep(1000);
		driver.findElement(By.id("password_step_input")).sendKeys("Rainbow99");
		Thread.sleep(1000);
		driver.findElement(By.id("month")).sendKeys("June");
		driver.findElement(By.id("day")).sendKeys("10");
		driver.findElement(By.id("year")).sendKeys("2000");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(1000);

	}

}
