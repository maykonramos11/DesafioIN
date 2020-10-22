package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

    private static WebDriver driver;
    protected static WebDriverWait wait;

    public static void init(String navegador, String url) {

        switch (navegador.toUpperCase()) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            default:
                break;
        }

        driver.manage().window().maximize();
        driver.get(url);
        wait = new WebDriverWait(driver, 30);
    }

    public static void quit() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }


    public void clicarElemento(WebElement elemento) {
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
        elemento.click();
    }

    public void clicarXpath(String xpath) {
        WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        elemento.click();
    }

    public void aguardaXpath(String xpath) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public void selecionarElementoTextoVisivel(WebElement elemento, String texto) {
        Select selecionartMarca = new Select(elemento);
        selecionartMarca.selectByVisibleText(texto);
    }

    public void selecionarElementoValor(WebElement elemento, String valor) {
        Select selecionartMarca = new Select(elemento);
        selecionartMarca.selectByValue(valor);
    }

    public void selecionarElementoIndex(WebElement elemento, int index) {
        Select selecionartMarca = new Select(elemento);
        selecionartMarca.selectByIndex(index);
    }

    public void inserirTextoElemento(WebElement elemento, String texto) {
        wait.until(ExpectedConditions.visibilityOf(elemento));
        elemento.sendKeys(texto);
    }

    public void aguardarElemento(WebElement elemento) {
        wait.until(ExpectedConditions.visibilityOf(elemento));

    }
}
