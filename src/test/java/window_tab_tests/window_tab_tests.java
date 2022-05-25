package window_tab_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class window_tab_tests {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users//User//Selenium//ChromeDriver//chromedriver.exe/"); //drivers path
        WebDriver driver = new ChromeDriver(); //driver object
        driver.get("https://demoqa.com/browser-windows");

        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();

        //////iki tane tab olup olmadığının kontrolü

        List<String> tabs = new ArrayList<>(driver.getWindowHandles()); //driver.getWindowHandles method// unun yaptığı bu driverın üzerinde kaç tane tab var?

        System.out.println(tabs.size()); //kaç tane tab olduğunu gösterecek


        driver.switchTo().window(tabs.get(1)); //switch to diğer sayfaya geçiş yap. window penceresine tab gitsin 1. inci abı getirsin
        System.out.println(driver.getCurrentUrl()); //açılan tabın url sini alabildiğim method

        try{
            Thread.sleep(2000);             //tabın açılıp direk kapanmaması için 2 sn acık kalmasını sağladık.
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close(); //tabı veya pencereyi kapatmak için close() kullanılır drive kapanmaz. quit() driver komple kapanır driver gider.















    }

}
