package br.com.inmetrics.step;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import br.com.inmetrics.page.*;

public class CadastroNovoFuncionarioStep {

    private HomePage homePage;
    private CadastrePage cadastrePage;
    private ListaDeFuncionariosPage listaDeFuncionariosPage;
    private br.com.inmetrics.page.CadastroNovoFuncionarioPage CadastroNovoFuncionarioPage;

    public CadastroNovoFuncionarioStep () {
        this.homePage = new HomePage();
        this.cadastrePage = new CadastrePage();
        this.listaDeFuncionariosPage = new ListaDeFuncionariosPage();

    }

    @Quando("^preencher o Nome \"(.*?)\"$")
    public void preencher_o_Nome(String nome) throws Throwable {
        this.CadastroNovoFuncionarioPage.inserirNome(nome);
    }

    @Quando("^preencher o CPF \"(.*?)\"$")
    public void preencher_o_CPF(String nome) throws Throwable {
        this.CadastroNovoFuncionarioPage.inserirCPF(nome);
    }

    @Quando("^preencher o Sexo \"(.*?)\"$")
    public void preencher_o_Sexo(String sexo) throws Throwable {
        this.CadastroNovoFuncionarioPage.inserirSexo(sexo);
    }

    @Quando("^preencher a Admissao \"(.*?)\"$")
    public void preencher_a_Admissao(String admissao) throws Throwable {
        this.CadastroNovoFuncionarioPage.inserirAdmissao(admissao);
    }

    @Quando("^preencher a Carga \"(.*?)\"$")
    public void preencher_a_Carga(String cargo) throws Throwable {
        this.CadastroNovoFuncionarioPage.inserirCargo(cargo);
    }

    @Quando("^preencher Salario \"(.*?)\"$")
    public void preencher_Salario(String salario) throws Throwable {
        this.CadastroNovoFuncionarioPage.inserirSalario(salario);
    }

    @Quando("^preencher Tipo de Contratacao$")
    public void preencher_Tipo_de_Salario(String contratacao) throws Throwable {
        this.CadastroNovoFuncionarioPage.inserirSalario(contratacao);
    }

    @Quando("^clicar em Enviar$")
    public void clicar_em_Enviar() throws Throwable {
        this.CadastroNovoFuncionarioPage.clicarElementoEnviar();
    }
}
