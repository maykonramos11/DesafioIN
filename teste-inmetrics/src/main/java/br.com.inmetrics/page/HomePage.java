package br.com.inmetrics.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Util;

public class HomePage extends Util {

    public HomePage (){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    private WebElement elementoLogin;

    @FindBy(xpath = "//a[text()='Cadastre-se']")
    private WebElement elementoCadastro;

    @FindBy(name = "username")
    private WebElement elementoUsuario;

    @FindBy(name = "pass")
    private WebElement elementoSenha;

    @FindBy(className = "login100-form-btn")
    private WebElement botaoEntrar;

    public HomePage aguardandoHome (){
        aguardarElemento(elementoLogin);
        return this;
    }

    public HomePage clicarCadastro()  {
        clicarElemento(elementoCadastro);
        return this;
    }

    public HomePage inserirUsuario (String usuario){
        inserirTextoElemento(elementoUsuario, usuario);
        return this;
    }

    public HomePage inserirSenha (String senha){
        inserirTextoElemento(elementoSenha, senha);
        return this;

    }
    public HomePage clicarEntrar (){
        clicarElemento(botaoEntrar);
        return this;
    }
}
