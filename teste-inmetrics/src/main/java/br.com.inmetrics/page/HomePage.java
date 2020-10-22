package br.com.inmetrics.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Util;

public class HomePage extends Util {

    public HomePage (){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
    private WebElement elementoCriarConta;

    public HomePage clicarElementoCriarConta()  {
        clicarElemento(elementoCriarConta);
        return this;
    }
}
