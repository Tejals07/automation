package policyBazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobPage {
WebDriver driver ;

@FindBy (xpath="(//input[@id='central-login-module-sign-mobile'])[2]")
private WebElement mobNu;
@FindBy (xpath="(//span [@id='central-login-sign-in-with-password-span'])[2]")
private WebElement signIwPwd;

public PBMobPage (WebDriver driver ) {
	PageFactory.initElements(driver, this);
	
}
public void InpPBMobPageMobnu(String mobNum) {
	mobNu.sendKeys(mobNum);
	
}
public void clickPBMobPageSignIwPwd() {
	signIwPwd.click();
}
}
