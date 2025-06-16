package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import setup.Main;

public class Challenge_CompleteForm extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    /*
     * TODO: add your solution here
     * Enter “username” in the Text input field
     * Enter passw0rd in the Password field
     * Write “I am learning Selenium WebDriver” in the Textarea field
     * Select the Three option from the dropdown
     * Deselect Checked checkbox
     * Select Default checkbox
     * Select Default radio
     * And click the Submit button
     */ 

    WebElement userName = driver.findElement(By.id("my-text-id"));
    userName.sendKeys("Sai Charan");

    WebElement password = driver.findElement(By.name("my-password"));
    password.sendKeys("Sai@123");

    WebElement description = driver.findElement(By.name("my-textarea"));
    description.sendKeys("I am learning Selenium WebDriver");

    Select dropdown = new Select(driver.findElement(By.name("my-select")));
    dropdown.selectByVisibleText("Three");

    WebElement checkbox = driver.findElement(By.id("my-check-1"));
    boolean isSelected = checkbox.isSelected();
    if (checkbox.isSelected) {
      checkbox.click();
    }

    WebElement defaultCheckbox = driver.findElement(By.id("my-check-2"));
    boolean isSelected = defaultCheckbox.isSelected();
    if (!isSelected) {
      checkbox.click();
    }

    driver.findElement(By.id("my-radio-2"))

    driver.findElement(By.xpath("//button[text()='Submit']")).click();

    driver.quit();
  }
}