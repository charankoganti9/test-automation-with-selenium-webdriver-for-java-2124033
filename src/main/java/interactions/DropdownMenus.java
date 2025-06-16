package interactions;

import setup.Main;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DropdownMenus extends Main {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    Select dropDown = new Select(driver.findElement(By.name("my-select")));
    dropDown.selectByValue(2);
    dropDown.selectByIndex(1);
    dropDown.selectVisibleText("Three");

    WebElement selectedOption = dropDown.getFirstSelectedOption();
    List<WebElement> selectedOptions = dropDown.getAllSelectedOptions();


    driver.quit();
  }
  
}
