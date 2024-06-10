import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdtiver.chrome.drive","C:\\Users\\Rohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.whatsapp.com");
		Navigation nav =driver.navigate();
		Thread.sleep(5000);
		nav.to("https://www.whatsapp.com");
		Thread.sleep(5000);
		nav.back();
		Thread.sleep(5000);
		nav.forward();
		Thread.sleep(5000);
		nav.refresh();	}

	



}
