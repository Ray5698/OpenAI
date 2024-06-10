
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;					

		public class Facebook{
		
		
		public static String getExcelData (String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream ("C:\\Users\\Rohan\\Documents\\TestData.xlsx");
			String value = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
			return value;
			
		}
		public static void main(String[]args)throws EncryptedDocumentException, IOException, Throwable {
			System.setProperty("webdtiver.chrome.drive","C:\\Users\\Rohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
			String firstname = getExcelData ("Facebook",0,0);
			System.out.println(firstname); 
			String lastname = getExcelData("Facebook",1,0);
			System.out.println(lastname);
			String email= getExcelData("Facebook",2,0);
			System.out.println(email);
			String pass= getExcelData("Facebook",3,0);
			System.out.println(pass);
			WebElement first = driver.findElement(By.xpath("//input[@name='firstname']"));
			first.sendKeys(firstname);
			WebElement last = driver.findElement(By.xpath("//input[@name='lastname']"));
			last.sendKeys(lastname);
			WebElement mail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			mail.sendKeys(email);
			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys(pass);
			WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			Select a = new Select(day);
			a.selectByIndex(15);
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			Select b = new Select(month);
			b.selectByIndex(1);
			
			WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
			Select c = new Select(year);
			c.selectByIndex(24);
			
			WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
			gender.click();
	}
		
		
		}



