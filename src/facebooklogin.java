import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) throws InterruptedException {
	
       
		System.setProperty("webdriver.chrome.driver", "D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("shahinsayyed66@gmal.com");
		driver.findElement(By.name("pass")).sendKeys("shahin12345");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
	
	}
}
