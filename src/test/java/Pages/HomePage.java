package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver dri;
	
	public HomePage(WebDriver dri) {
		this.dri = dri;
	}
	
	private By mySpaceLink = By.xpath("//a[@href='/in/mypage']");
	private By exploreLink = By.xpath("//a[@href='/in/explore']");
	private By homeLink = By.xpath("//a[@href='/in/home']");
	private By showsLink = By.xpath("//a[@href='/in/shows']");
	private By moviesLink = By.xpath("//a[@href='/in/movies']");
	private By sportsLink = By.xpath("//a[@href='/in/sports']");
	private By categoriesLink = By.xpath("//a[@href='/in/categories']");
	
	public Boolean isMySpaceLinkExists() {
		WebElement ele = dri.findElement(mySpaceLink);
		return ele.isDisplayed();
	}
	
	public void clickMySpaceLink() {
		if(isMySpaceLinkExists()) {
			WebElement ele = dri.findElement(mySpaceLink);
			ele.click();
		}
	}	
	
	public Boolean isExploreLinkExists() {
		WebElement ele = dri.findElement(exploreLink);
		return ele.isDisplayed();
	}
	
	public Boolean isHomeLinkExists() {
		WebElement ele = dri.findElement(homeLink);
		return ele.isDisplayed();
	}
	
	public Boolean isShowsLinkExists() {
		WebElement ele = dri.findElement(showsLink);
		return ele.isDisplayed();
	}
	
	public Boolean isMoviesLinkExists() {
		WebElement ele = dri.findElement(moviesLink);
		return ele.isDisplayed();
	}
	
	public Boolean isSportsLinkExists() {
		WebElement ele = dri.findElement(sportsLink);
		return ele.isDisplayed();
	}
	
	public Boolean isCategoriesLinkExists() {
		WebElement ele = dri.findElement(categoriesLink);
		return ele.isDisplayed();
	}
	
	public Boolean isAllNavLinksExists() {
		if(isMySpaceLinkExists() && isExploreLinkExists() && isHomeLinkExists() && isShowsLinkExists() && isMoviesLinkExists() && isSportsLinkExists() && isCategoriesLinkExists())
			return true;
		return false;
		
	}
	
	public String getCurrentURL() {
		return dri.getCurrentUrl();
	}
	
	
}
