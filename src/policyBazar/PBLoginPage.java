package policyBazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage {
WebDriver driver ;

@FindBy (xpath = "//a[@class='sign-in']")
private WebElement sigIn;

public PBLoginPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickPBloginPageSignIn() {
	sigIn.click();
}
}
