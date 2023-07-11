package a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
	
static 	WebDriver driver ;
	
public static void main (String args []) {
	driver = new ChromeDriver ();
	driver.get("https://www.policybazaar.com/");
	WebElement id = driver.findElement(By.xpath("//div[text()='My Account']"));
	Actions a = new Actions (driver);
	a.moveToElement(id).perform();
}
}
