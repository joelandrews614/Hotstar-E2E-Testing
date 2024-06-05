package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyPage {

	private WebDriver dri;
	
	public MyPage(WebDriver dri) {
		this.dri = dri;
	}
	
	private By loginBtn = By.xpath("//div/button[@type='button']");
	
	public boolean isLoginBtnExists() {
		WebElement ele = dri.findElement(loginBtn);
		return ele.isDisplayed();
	}
}
