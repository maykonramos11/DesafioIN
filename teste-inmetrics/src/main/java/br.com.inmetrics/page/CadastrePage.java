package br.com.inmetrics.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Util;

public class CadastrePage extends Util {

    public CadastrePage (){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='login100-form-title']")
    private WebElement elementoCadastro;

    @FindBy(name = "username")
    private WebElement elementoUsuario;

    @FindBy(name = "pass")
    private WebElement elementoSenha;

    @FindBy(name = "confirmpass")
    private WebElement elementoConfirmaSenha;

    @FindBy(className = "login100-form-btn")
    private WebElement botaoCadastrar;


    public CadastrePage inserirUsuario(String usuario)  {
        inserirTextoElemento(elementoUsuario, usuario);
        return this;
    }

    public CadastrePage inserirSenha(String senha) {
        inserirTextoElemento(elementoSenha, senha);
        return this;
    }

    public CadastrePage inserirConfirmaSenha(String confirmasenha) {
        inserirTextoElemento(elementoConfirmaSenha, confirmasenha);
        return this;
    }

    public CadastrePage clicarElementoCadastre()  {
        clicarElemento(botaoCadastrar);
        return this;

    }


}



