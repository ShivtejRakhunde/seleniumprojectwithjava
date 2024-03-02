package DemoTest.Test17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase {
	
	public static void delay() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch chrome web browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				//open amazon website
				driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=15985260813351608488&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
				
				delay();
				
				//locate sign in
				driver.findElement(By.linkText("Sign in")).click();
				
				delay();
				
				//enter email
				driver.findElement(By.id("ap_email")).sendKeys("utkarshghare0145@gmail.com");
				
				delay();
				
				//continue
				driver.findElement(By.id("continue")).click();
				
				delay();
				
				//enter password
				driver.findElement(By.id("ap_password")).sendKeys("amaze@ug");
				
				delay();
				
				//sign in
				driver.findElement(By.id("signInSubmit")).click();
				
				delay();
				
				//search product
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell G3 15");
				
				delay();
				
				//click search
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				delay();
				
				//add to cart
				driver.findElement(By.id("a-autoid-4-announce")).click();
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//view cart
				driver.findElement(By.id("nav-cart-count")).click();
				
				//driver.close();
	}

}
