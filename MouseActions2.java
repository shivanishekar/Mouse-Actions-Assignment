/*2. Navigate to https://www.qa-practice.com/elements/dragndrop/images Drag n Drop the yellow smiley face*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.qa-practice.com/elements/dragndrop/images");
        Thread.sleep(2000);

        Actions actions = new Actions(driver);

        WebElement source = driver.findElement(By.id("smiley"));
        WebElement target = driver.findElement(By.id("target"));

        actions.dragAndDrop(source, target).perform();

        Thread.sleep(3000);
        driver.quit();
    }
}
/*Output :
Browser launched successfully
Navigated to QA Practice Drag and Drop Images page\
Yellow smiley face dragged
Smiley face dropped successfully into the target area*/
