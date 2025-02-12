package Stage.pageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomProducts {

    WebDriver driver;
    WebDriverWait wait;

    public CustomProducts(WebDriver driver) {
        //`driver` you pass when you create an instance of `CustomProducts` is saved and used later for methods like `switchToIFrame()`.
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 45);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "cpb")
    @CacheLookup
    WebElement iFrame;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]")
    @CacheLookup
    WebElement editButton;

    @FindBy(xpath = "//*[@id=\"product-builder\"]/div[1]/div/div/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement adminMode;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[2]/div[3]/div[1]")
    @CacheLookup
    WebElement cloneButton;


    public void switchToIFrame() {
        driver.switchTo().frame(iFrame);
    }

    public void clickEditButton() {
        wait.until(ExpectedConditions.visibilityOf(editButton));
        editButton.click();
    }

    public void clickAdminMode() {
        wait.until(ExpectedConditions.elementToBeClickable(adminMode));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", adminMode);
    }

    public void cloneButton() {
        wait.until(ExpectedConditions.elementToBeClickable(cloneButton));
        cloneButton.click();
    }
}