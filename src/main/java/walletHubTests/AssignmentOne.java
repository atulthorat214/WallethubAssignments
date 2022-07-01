package walletHubTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.loginPage;

public class AssignmentOne {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/driver2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		loginPage Applogin = new loginPage();
		Applogin.launch_url(driver);
		Applogin.enter_username(driver, "testUsername");
		Applogin.enter_password(driver, "testPassword");
		Applogin.submitButton(driver);
		System.out.println("Log In happens Successfully");
		
		System.out.println("dfdsfsdf");
		
	}

}
