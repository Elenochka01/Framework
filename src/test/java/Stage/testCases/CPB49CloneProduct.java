package Stage.testCases;

import Stage.pageObjects.AdminMode;
import Stage.pageObjects.CustomProducts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CPB49CloneProduct extends BaseClass {

    @Test
    public void CPB49CloneProduct () throws InterruptedException, IOException {
        driver.get(stageURL);
        logger.info("open stage site");

        CustomProducts cp = new CustomProducts(driver);
        AdminMode ad = new AdminMode(driver);

        cp.switchToIFrame();
        logger.info("switch to iFrame");
        Thread.sleep(25000);

        cp.cloneButton();
        logger.info("Clone");
        Thread.sleep(30000);

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("1Vase"));
        logger.info("Cloned Product is exist");
        Thread.sleep(3000);

        ad.clickDeleteButton();
        logger.info("Delete Clone");
        Thread.sleep(8000);

        WebElement confirmYes = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[6]/button[1]"));
        confirmYes.click();
        logger.info("Clone is deleted");
        Thread.sleep(5000);

        String pageNewText = driver.getPageSource();
        assertFalse(pageNewText.contains("1Vase-Copy"));
        logger.info("Clone is not exist anymore");
        logger.info("Test is passed");
    }
}