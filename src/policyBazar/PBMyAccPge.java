package policyBazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPge {
	
 static WebDriver driver ;
@FindBy(xpath="//div[text()='My Account']")
private WebElement myAcc;
public PBMyAccPge (WebDriver driver ) {
	PageFactory.initElements(driver, this);
}
public void mouseHoverPBMyAccPageMyAcc () {
	Actions a= new Actions (driver);
	a.moveToElement(myAcc).perform();
}
}
