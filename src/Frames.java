import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdtiver.chrome.drive","C:\\Users\\Rohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.navigate().to("http://demo.automationtesting.in/Frames.html");
	
	
	//driver.switchTo().frame("singleframe");//using id or name
	
	//driver.switchTo().frame(0);
	//WebElement text = driver.findElement(By.xpath("//input [@type='text']"));
	//text.sendKeys("rohit");
	WebElement frames = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
	driver.switchTo().frame(frames);
	WebElement text = driver.findElement(By.xpath("//input [@type='text']"));
	text.sendKeys("Rohit");
	}

}
