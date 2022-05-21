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

        System.out.println("Page title is: " + driver.getTitle());

		 driver.quit();
    }
}
