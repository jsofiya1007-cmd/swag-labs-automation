package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void click(By by) {
        driver.findElement(by).click();
    }

    public void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public String getElementText(By by) {
        return driver.findElement(by).getText();
    }
}