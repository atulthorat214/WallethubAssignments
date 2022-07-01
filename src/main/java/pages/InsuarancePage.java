package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsuarancePage {

	public static WebDriver driver;

	// Using list , iterating the dropDown Values
	public void SelectInsuaranceType(WebDriver driver) throws InterruptedException {
		WebElement dropDown = driver.findElement(By.xpath("//div[@class='dropdown second']"));
		dropDown.click();
		Thread.sleep(1000);
		List<WebElement> insuaranceValues = driver
				.findElements(By.xpath("//div[@class='dropdown second opened']/ul/li"));

		try {
			for (int i = 0; i <= insuaranceValues.size(); i++) {

				if (insuaranceValues.get(i).getText().contentEquals("Health Insurance")) {

					insuaranceValues.get(i).click();
					break;

				}
			}
		}

		catch (ElementNotVisibleException e) {
			e.printStackTrace();
		}
	}

	// Review comment method
	public void addReviewComments(WebDriver driver) throws InterruptedException {
		WebElement textarea = driver.findElement(By.xpath("//textarea[@placeholder='Write your review...']"));
		Thread.sleep(1000);
		textarea.click();
		textarea.sendKeys(
				"I have applied for Health Insuarance Policy,I have applied for Health Insuarance Policy,I have applied for Health Insuarance Policy,I have applied for Health Insuarance Policy");
	}

	// Submit Button Method
	public void SubmitApplication(WebDriver driver) {
		WebElement SubmitButton = driver.findElement(By.xpath("//div[contains(text(),' Submit ')]"));

		SubmitButton.click();
	}

}
