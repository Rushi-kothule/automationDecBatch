package pomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.Confi;

public class SignUpTC {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", Confi.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get(Confi.aapurl);
		driver.manage().window().maximize();

		SignUp perform = new SignUp(driver);
		Exceldata dd = new Exceldata();
		
		
		perform.firstname(dd.testdata(1, 0));
		perform.Lastname(dd.testdata(2, 0));
		perform.mailid(dd.testdata(3, 0));
		perform.confrommail(dd.testdata(3, 0));
		perform.Password(dd.testdata(4, 0));
		perform.Day("14");
		perform.Month("Jan");
		perform.Year("2000");
		perform.gender();

		driver.get(Confi.aapurl);
		perform.firstname("jhon");
		perform.Lastname("wick");
		perform.mailid("babayaga@gamil.com");
		perform.confrommail("babayaga@gamil.com");
		perform.Password("12344567897");
		perform.Day("31");
		perform.Month("Dec");
		perform.Year("1999");
		perform.gender();

	}

}
