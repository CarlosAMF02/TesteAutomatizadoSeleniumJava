package automacao;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
public class automacao {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:/Compliance-Trabs/automacao/src/main/java/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.br/");

        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));

        element.sendKeys("Livro George Orwel");
        
        element.submit();
        
        WebElement account = driver.findElement(By.id("nav-link-accountList"));

        account.click();
        
        WebElement createAccount = driver.findElement(By.id("createAccountSubmit"));

        createAccount.click();
        
        WebElement name = driver.findElement(By.id("ap_customer_name"));

        name.sendKeys("Carlos Ferreira");
        
        WebElement email = driver.findElement(By.id("ap_email"));

        email.sendKeys("reddudisbr@outlook.com");
        
        WebElement password = driver.findElement(By.id("ap_password"));

        password.sendKeys("CachorroGosto!!");
        
        WebElement checkPassword = driver.findElement(By.id("ap_password_check"));

        checkPassword.sendKeys("CachorroGosto!!");
        
        WebElement continueCreateAccount1 = driver.findElement(By.id("continue"));
        
        continueCreateAccount1.click();

        System.out.println("Page title is: " + driver.getTitle());

		 //driver.quit();
    }
}
