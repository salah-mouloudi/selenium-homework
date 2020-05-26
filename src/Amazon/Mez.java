package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mez {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","BrowserDriver/MacDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.quit();
    }
}
