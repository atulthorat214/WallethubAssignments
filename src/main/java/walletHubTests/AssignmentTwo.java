package walletHubTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.InsuarancePage;
import pages.homePage;

public class AssignmentTwo {

	public static void main(String[] args) throws InterruptedException {

		homePage appPages = new homePage();
		InsuarancePage insuarancePage = new InsuarancePage();
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/driver2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		appPages.launchApplicationUrl(driver);
		appPages.hoverElementAndhighlight(driver);
		insuarancePage.SelectInsuaranceType(driver);
		insuarancePage.addReviewComments(driver);
		insuarancePage.SubmitApplication(driver);
		//close the browser instance
		driver.close();
		System.out.println("Test Passes Successfully");
	}

}
