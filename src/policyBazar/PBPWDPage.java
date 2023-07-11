package policyBazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPWDPage {
WebDriver driver ;
@FindBy (xpath="//input[@name='password']")

private WebElement pwd;
@FindBy(xpath="//a[@id='login-in-with-password']")
private WebElement signWPass;
public PBPWDPage (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void inpPBPwdPagePwd(String pass) {
	pwd.sendKeys(pass);
}
public void clickPBpwdPageSignin() {
	signWPass.click();
}
}
