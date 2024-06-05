package stepDefs;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HomeSteps {
	
	private WebDriver dri = null;
	private HomePage homePage = null;
	
	@Before
	public void setUp() {
	
		System.setProperty("webdriver.edge.driver", "src/test/resources/webdrivers/EdgeDriver.exe");
		
		dri = new EdgeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dri.get("https://web.hotstar.com/in/home");
		
	}
	
	@After
	public void tearDown() {
		
		dri.quit();
		
	}
	
	@Given("user is on Homepage")
	public void user_is_on_homepage() {
		
		homePage = new HomePage(dri);
		
		Assert.assertEquals("https://web.hotstar.com/in/home", homePage.getCurrentURL());

	}

	@Given("user can see the Navbar Icons")
	public void user_can_see_the_navbar_icons() {

		Assert.assertEquals(true, homePage.isAllNavLinksExists());
		
	}


	
}
