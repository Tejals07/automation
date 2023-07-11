package policyBazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyProfilePage {
WebDriver driver ;
@FindBy(xpath = "//span[text()=' My profile ']")
private WebElement myPro;
public PBMyProfilePage (WebDriver driver ) {
	PageFactory.initElements(driver,this);
	
}
public void clickPBMyProfPageMyProfile() {
	myPro.click();
	
}
}
