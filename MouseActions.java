/* Mouse Actions Assignment 
1. Navigate to https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html 
Mouse hover on "Tutorials" and select "Java" 
2. Navigate to https://www.qa-practice.com/elements/dragndrop/images 
Drag n Drop the yellow smiley face */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsAssignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(2000);

        WebElement tutorialsMenu = driver.findElement(By.xpath("//a[text()='Tutorials']"));
        WebElement javaOption = driver.findElement(By.xpath("//a[text()='Java']"));

        actions.moveToElement(tutorialsMenu)
               .moveToElement(javaOption)
               .click()
               .build()
               .perform();

        Thread.sleep(3000);

        driver.get("https://www.qa-practice.com/elements/dragndrop/images");
        Thread.sleep(2000);

        WebElement source = driver.findElement(By.id("smiley"));
        WebElement target = driver.findElement(By.id("target"));

        actions.dragAndDrop(source, target).perform();

        Thread.sleep(3000);

        driver.quit();
    }
}

/*Console Output : 
  Browser launched successfully
  Mouse hover performed on Tutorials menu
  Java option clicked successfully
  Drag and Drop action completed successfully */
