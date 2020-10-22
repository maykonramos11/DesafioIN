package br.com.inmetrics.page;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Util;

public class ListaDeFuncionariosPage extends Util {

    public ListaDeFuncionariosPage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Novo Funcionário']")
    private WebElement botaoFuncionarios;

    public ListaDeFuncionariosPage validarTelaListaDeFuncionarios(){
        aguardarElemento(botaoFuncionarios);
        assertTrue("Elemento funcionarios nao encontrado", botaoFuncionarios.isDisplayed());
        return this;
    }
}
