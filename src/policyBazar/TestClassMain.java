package policyBazar;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassMain {
	static WebDriver driver ;
	
public static void main (String args []) throws InterruptedException {
	driver = new ChromeDriver ();
	driver.manage().deleteAllCookies();
	driver.get("https://www.policybazaar.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	PBLoginPage a= new PBLoginPage (driver);
	a.clickPBloginPageSignIn();
	PBMobPage b = new PBMobPage (driver);
	b.InpPBMobPageMobnu("7385555858");
	b.clickPBMobPageSignIwPwd();
PBPWDPage f = new PBPWDPage (driver);
f.inpPBPwdPagePwd("Anmol@2151");
f.clickPBpwdPageSignin();
Thread.sleep(3000);
	PBMyAccPge c = new PBMyAccPge(driver);
	c.mouseHoverPBMyAccPageMyAcc();
	PBMyProfilePage d = new PBMyProfilePage (driver);
	d.clickPBMyProfPageMyProfile();

}
}
