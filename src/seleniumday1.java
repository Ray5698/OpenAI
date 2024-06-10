
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday1 {
	public static void main(String[]args) {
		System.setProperty("webdtiver.chrome.drive","C:\\Users\\Rohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.whatsapp.com");
	}

	
	}


