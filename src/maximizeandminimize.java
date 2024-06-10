
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeandminimize{
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdtiver.chrome.drive","C:\\Users\\Rohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.Amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	
	}
}

