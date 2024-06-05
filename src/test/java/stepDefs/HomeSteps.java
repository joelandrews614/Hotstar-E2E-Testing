package stepDefs;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.HomePage;
import Pages.MyPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HomeSteps {
	
	private WebDriver dri = null;
	private HomePage homePage = null;
	private MyPage myPage = null;
	
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
	
//	#1 Scenario:
	@Given("user is on Homepage")
	public void user_is_on_homepage() {
		
		homePage = new HomePage(dri);
		
		Assert.assertEquals("https://web.hotstar.com/in/home", homePage.getCurrentURL());

	}

	@Given("user can see the Navbar Icons")
	public void user_can_see_the_navbar_icons() {

		Assert.assertEquals(true, homePage.isAllNavLinksExists());
		
	}
//	#1 Scenario:
	

//	#2 Scenario:
	@Given("user can see the my space link")
	public void user_can_see_the_my_space_link() {
		
		Assert.assertEquals(true, homePage.isMySpaceLinkExists());

	}

	@When("user clicks on the my space link")
	public void user_clicks_on_the_my_space_link() {

		homePage.clickMySpaceLink();
		
		
	}

	@Then("user should see the login button")
	public void user_should_see_the_login_button() {

		myPage = new MyPage(dri);
		
		Assert.assertEquals(true, myPage.isLoginBtnExists());

	}
//	#2 Scenario:
	
}
