import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/ajax");
        driver.findElement(By.cssSelector("button.violet")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("t1")));
        String text = driver.findElement(By.tagName("t1")).getText();
        System.out.println(text);

        WebElement delayedText = driver.findElement(By.tagName("t3"));
        System.out.println(delayedText.getText());
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("t3"), "I'm late!"));
        String lateText = driver.findElement(By.tagName("t3")).getText();
        System.out.println(lateText);

        driver.quit();
    }
}
