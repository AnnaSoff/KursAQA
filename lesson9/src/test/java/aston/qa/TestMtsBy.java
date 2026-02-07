package aston.qa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMtsBy {
    private WebDriver driver;
    private WebDriverWait wait;
   
    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\Anna\\Desktop\\Test\\Aston\\AQA\\Autotest\\lesson_9\\src\\test\\java\\aston\\qa\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Test 
    public void acceptCookies() {
        driver.get("https://www.mts.by");
        WebElement cookieButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.id("\"cookie-agree\"")));
        cookieButton.click();
        
    }
    @Test
    public void testRefillBlock() {
        WebElement blockTitle = driver.findElement(By.xpath("//section[contains(@class, 'pay')]//h2"));
        String actualText = blockTitle.getText();
        String expectedText = "Онлайн пополнение\\nбез комиссии";
        assertEquals(expectedText, actualText, "Текст элемента не совпадает!");

        List<WebElement> logos = driver.findElements(By.xpath("//div[contains(@class, 'pay__partners')]//img"));
        assertFalse(logos.isEmpty(), "Логотипы платёжных систем не найдены");

        WebElement detailsLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        detailsLink.click();
        assertTrue(driver.getCurrentUrl().contains("help/poryadok-oplaty-i-bezopasnost"), "Ссылка 'Подробнее' ведет на неверную страницу");
        driver.navigate().back(); 
    }
    
    @Test
    void testRefillFormConnectionServices() {
        WebElement connectionOption = driver.findElement(By.xpath("//button[contains(text(), 'Услуги связи')]"));
        connectionOption.click();

        WebElement phoneField = driver.findElement(By.id("connection-phone"));
        WebElement sumField = driver.findElement(By.id("connection-sum"));
        WebElement emailField = driver.findElement(By.id("connection-email"));
        WebElement submitButton = driver.findElement(By.xpath("//form[@id='pay-connection']//button[contains(text(), 'Продолжить')]"));

        phoneField.sendKeys("297777777");
        sumField.sendKeys("100");
        emailField.sendKeys("ananas@email.com");

        submitButton.click();

        wait.until(ExpectedConditions.urlContains("checkout"));
        assertTrue(driver.getCurrentUrl().contains("checkout"), "Кнопка 'Продолжить' не инициировала переход к оплате");
    }
    
        @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

