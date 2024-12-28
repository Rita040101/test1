import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class MtsByTests {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/margaritarazvodovskaya/tools/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://mts.by");

            testBlockTitle(driver, wait);
            testPaymentSystemLogos(driver);
            testServiceLink(driver, wait);
            testFormSubmission(driver, wait);

            System.out.println("Все тесты пройдены успешно!");

        } catch (Exception e) {
            System.out.println("Ошибка при выполнении тестов: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }

    public static void testBlockTitle(WebDriver driver, WebDriverWait wait) {
        WebElement blockTitle = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//h2[contains(text(), 'Онлайн пополнение без комиссии')]")
        ));
        assert blockTitle.getText().equals("Онлайн пополнение без комиссии") : "Название блока неверно!";
    }

    public static void testPaymentSystemLogos(WebDriver driver) {
        List<WebElement> logos = driver.findElements(By.xpath("//div[contains(@class, 'payment-logos')]//img"));
        assert logos.size() > 0 : "Логотипы платёжных систем не найдены!";
    }

    public static void testServiceLink(WebDriver driver, WebDriverWait wait) {
        WebElement serviceLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Подробнее о сервисе")
        ));
        serviceLink.click();

        assert Objects.requireNonNull(driver.getCurrentUrl()).contains("details") : "Ссылка 'Подробнее о сервисе' не работает!";
        driver.navigate().back();
    }

    public static void testFormSubmission(WebDriver driver, WebDriverWait wait) {
        WebElement serviceDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@class='select__select']//select[@id='pay']")
        ));
        serviceDropdown.click();

        WebElement serviceOption = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//option[@value='Услуги связи']")
        ));
        serviceOption.click();

        WebElement phoneInput = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//input[@class='phone'][@id='connection-phone']")
        ));
        phoneInput.sendKeys("297777777");

        WebElement amountInput = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//input[@class='total_rub'][@id='connection-sum']")
        ));
        amountInput.sendKeys("10");

        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(text(), 'Продолжить')]")
        ));
        continueButton.click();

        WebElement confirmationMessage = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[contains(@class, 'confirmation-message')]")
        ));
        assert confirmationMessage.getText().toLowerCase().contains("успешно") : "Кнопка 'Продолжить' не работает корректно!";
    }
}
