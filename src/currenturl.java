import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currenturl{
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdtiver.chrome.drive","C:\\Users\\Rohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.Amazon.in");
	String title =driver.getTitle();
	System.out.println(title);
	String url= driver.getCurrentUrl();
	Thread.sleep(5000);
	System.out.println(url);
	
	}
}

