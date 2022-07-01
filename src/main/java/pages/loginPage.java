package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement.*;

public class loginPage {

	public static WebDriver driver;

	// Method to invoke the Application url
	public void launch_url(WebDriver driver) {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	// Method to enter Application userName
	public void enter_username(WebDriver driver, String name) {
		WebElement username = driver.findElement(By.name("email"));

		username.sendKeys(name);
		System.out.println("UserName Enters");

	}

	// method to enter Application PassWords
	public void enter_password(WebDriver driver, String pwd) {
		WebElement password = driver.findElement(By.name("pass"));

		password.sendKeys(pwd);
		System.out.println("Password Enters");

	}

	// Method to click on logIn button
	public void submitButton(WebDriver driver)

	{
		WebElement logInbutton = driver.findElement(By.name("login"));

		logInbutton.click();
	}

	// Method to close the browser instance
	public void quit() {

		driver.close();

	}

}
