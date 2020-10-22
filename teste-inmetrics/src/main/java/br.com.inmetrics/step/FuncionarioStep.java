package br.com.inmetrics.step;

import br.com.inmetrics.page.HomePage;
import br.com.inmetrics.page.ListaDeFuncionariosPage;
import cucumber.api.java.pt.Dado;

public class FuncionarioStep {

    private HomePage homePage;
    private ListaDeFuncionariosPage listaDeFuncionariosPage;

    public FuncionarioStep (){

        this.homePage = new HomePage();
        this.listaDeFuncionariosPage = new ListaDeFuncionariosPage();
    }

    @Dado("^que realize login com o usuario \"(.*?)\" e senha \"(.*?)\"$")
    public void que_realize_login_com_o_usuario_e_senha(String usuario, String senha) throws Throwable {
        this.homePage.inserirUsuario(usuario).inserirSenha(senha).clicarEntrar();
    }

    @Dado("^acesse a lista de funcionarios$")
    public void acesse_a_lista_de_funcionarios() throws Throwable {
        this.listaDeFuncionariosPage.validarTelaListaDeFuncionarios();
    }
}
