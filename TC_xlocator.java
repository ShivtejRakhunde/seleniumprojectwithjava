package DemoTest.Test17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_xlocator {
	
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
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\OneDrive\\Desktop\\DemoTest\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		//open sauce demo website
		driver.get("http://www.saucedemo.com");
		delay();
		//locate username by id
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		delay();
		//locate password by name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		delay();
		//locate login button by class name
		driver.findElement(By.className("submit-button")).click();
		delay();
		//locate item by class name
		driver.findElement(By.className("inventory_item_name")).click();
		delay();
		//locate add to cart by id
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		delay();
		//locate view cart by class name
		driver.findElement(By.className("shopping_cart_link")).click();
		delay();
		//locate checkout by id
		driver.findElement(By.id("checkout")).click();
		delay();
		//locate first name by id
		driver.findElement(By.id("first-name")).sendKeys("Shivtej");
		delay();
		//locate last name by id
		driver.findElement(By.id("last-name")).sendKeys("Rakhunde");
		delay();
		//locate postal code by id
		driver.findElement(By.id("postal-code")).sendKeys("411033");
		delay();
		//locate continue by id
		driver.findElement(By.id("continue")).click();
		delay();
		//locate finish by id
		driver.findElement(By.id("finish")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.close();
	
	}

}
