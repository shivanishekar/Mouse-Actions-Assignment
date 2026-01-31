/* Mouse Actions Assignment 
1. Navigate to https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html 
Mouse hover on "Tutorials" and select "Java" */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(2000);

        Actions actions = new Actions(driver);

        WebElement tutorials = driver.findElement(By.xpath("//a[text()='Tutorials']"));
        WebElement javaOption = driver.findElement(By.xpath("//a[text()='Java']"));

        actions.moveToElement(tutorials)
               .moveToElement(javaOption)
               .click()
               .build()
               .perform();

        Thread.sleep(3000);

        driver.quit();
    }
}
/* Output : 
Browser launched successfully
Navigated to HYR Tutorials dropdown practice page
Mouse hovered on “Tutorials” menu
“Java” option selected successfully
Java tutorial page displayed */

 
