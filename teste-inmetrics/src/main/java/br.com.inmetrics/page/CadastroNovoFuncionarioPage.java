package br.com.inmetrics.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Util;

public class CadastroNovoFuncionarioPage extends Util {

    public CadastroNovoFuncionarioPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(name = "nome")
    private WebElement elementoNome;

    @FindBy(name = "cpf")
    private WebElement elementoCPF;

    @FindBy(name = "sexo")
    private WebElement elementoSexo;

    @FindBy(name = "admissao")
    private WebElement elementoAdmissao;

    @FindBy(name = "cargo")
    private WebElement elementoCargo;

    @FindBy(name = "salario")
    private WebElement elementoSalario;

    @FindBy(className = "cadastrar-form-btn")
    private WebElement clicarElementoCadastre;

    public CadastroNovoFuncionarioPage inserirNome(String nome) {
        inserirTextoElemento(elementoNome, nome);
        return this;
    }

    public CadastroNovoFuncionarioPage inserirCPF(String CPF) {
        inserirTextoElemento(elementoCPF, CPF);
        return this;
    }

    public CadastroNovoFuncionarioPage inserirSexo(String sexo) {
        inserirTextoElemento(elementoSexo, sexo);
        return this;
    }

    public CadastroNovoFuncionarioPage inserirAdmissao(String admissao) {
        inserirTextoElemento(elementoAdmissao, admissao);
        return this;
    }

    public CadastroNovoFuncionarioPage inserirCargo(String cargo) {
        inserirTextoElemento(elementoCargo, cargo);
        return this;
    }

    public CadastroNovoFuncionarioPage inserirSalario(String salario) {
        inserirTextoElemento(elementoSalario, salario);
        return this;

    }
    public CadastroNovoFuncionarioPage clicarElementoEnviar(){
        clicarElemento(clicarElementoCadastre);
        return this;

}
}