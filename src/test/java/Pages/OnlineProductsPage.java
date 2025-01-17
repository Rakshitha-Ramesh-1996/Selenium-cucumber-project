package Pages;

import Utilities.BrowserDriver;
import org.openqa.selenium.By;

public class OnlineProductsPage extends BrowserDriver {

    public static String formalShoes_dropDown=".fa.fa-angle-double-down.formalshoedropdown";
    public static String formal_shoe_name="/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void click_on_formal_shoes_dropdown() throws InterruptedException {
        driver.findElement(By.cssSelector(formalShoes_dropDown)).click();
    }
    public static String get_first_formal_shoe() throws InterruptedException {
    String formalShoeText=driver.findElement(By.xpath(formal_shoe_name)).getText();
    return formalShoeText;

    }
}
