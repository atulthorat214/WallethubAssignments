package pages;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {

	public static WebDriver driver;

	// Invoke the application url
	public void launchApplicationUrl(WebDriver driver) {
		driver.get("https://wallethub.com/profile/13732055i");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(400,TimeUnit.MILLISECONDS);
		

	}

	// Hover Element and lightup the selected element
	public void hoverElementAndhighlight(WebDriver driver) {
		WebElement starSymbol = driver.findElement(By.xpath(
				"//div[@class='rv review-action ng-enter-element']/review-star[@class='rvs-svg']/div//*[local-name()='svg' and @aria-label='4 star rating']"));

		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)", "");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		action.moveToElement(starSymbol).build().perform();
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid red;');", starSymbol);
		starSymbol.click();
	}

}
