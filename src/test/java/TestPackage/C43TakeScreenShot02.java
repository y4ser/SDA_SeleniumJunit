package TestPackage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C43TakeScreenShot02 extends TestBase {
    /*
    Go to Linkedin
    Take homepage's screenshot
    Take logo's screenshot
*/

    @Test
    public void screenShotWithTestBaseTest() throws InterruptedException {
        driver.get("https://www.linkedIn.com");
        Thread.sleep(3000);
        takeScreenShot(driver);

        WebElement element = driver.findElement(By.xpath("//icon[@data-test-id]"));
        takeScreenshotOfElement(driver,element);

    }



}
