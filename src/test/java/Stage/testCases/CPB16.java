package Stage.testCases;
import Stage.pageObjects.AdminMode;
import Stage.pageObjects.CustomProducts;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static Stage.testCases.BaseClass.driver;

public class CPB16 extends BaseClass {

        @Test
        public void CPB16() throws InterruptedException, IOException {driver.get(stageURL);
            logger.info("open stage site");

            CustomProducts cp = new CustomProducts(driver);
            AdminMode ad = new AdminMode(driver);
            Thread.sleep(3000);
            cp.switchToIFrame();
            logger.info("switch to iFrame");
            Thread.sleep(10000);
            cp.clickEditButton();
            logger.info("click Edit");
            Thread.sleep(3000);
            cp.clickAdminMode();
            logger.info("click Admin Mode");
            Thread.sleep(3000);
            ad.clickReorderToggle();
            logger.info("click on reorder toggle");
            Thread.sleep(3000);
            String OnMode = driver.getPageSource();
            Assert.assertTrue(OnMode.contains("Reorder Mode On"));
            logger.info("Reorder Mode is ON text presented");
            logger.info("Test passed");

        }
    }

