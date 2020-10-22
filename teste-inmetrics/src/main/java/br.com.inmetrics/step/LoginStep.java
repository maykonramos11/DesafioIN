package br.com.inmetrics.step;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import br.com.inmetrics.page.*;

public class LoginStep {

    private HomePage homePage;
    private ListaDeFuncionariosPage listaDeFuncionariosPage;

    public LoginStep (){
        this.homePage = new HomePage();
        this.listaDeFuncionariosPage = new ListaDeFuncionariosPage();
    }

    @Quando("^eu digitar o usuario \"(.*?)\"$")
    public void eu_digitar_o_usuario(String usuario) throws Throwable {
        this.homePage.inserirUsuario(usuario);
    }

    @Quando("^digitar a senha \"(.*?)\"$")
    public void digitar_a_senha(String senha) throws Throwable {
        this.homePage.inserirSenha(senha).clicarEntrar();
    }

    @Então("^serei direcionado para lista de funcionarios$")
    public void serei_direcionado_para_lista_de_funcionarios() throws Throwable {
        this.listaDeFuncionariosPage.validarTelaListaDeFuncionarios();
    }


}
