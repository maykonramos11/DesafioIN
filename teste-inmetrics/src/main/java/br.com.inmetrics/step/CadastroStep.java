package br.com.inmetrics.step;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import br.com.inmetrics.page.*;

public class CadastroStep {
    private static String usuario;
    private static String senha;
    private HomePage homePage;
    private CadastrePage cadastrePage;
    private ListaDeFuncionariosPage listaDeFuncionariosPage;

    public CadastroStep (){
        this.homePage = new HomePage();
        this.cadastrePage = new CadastrePage();
        this.listaDeFuncionariosPage = new ListaDeFuncionariosPage();

    }

    @Dado("^que acesse o imrobot$")
    public void que_acesse_o_imrobot() throws Throwable {
        this.homePage.aguardandoHome();

    }

    @Quando("^clico em Cadastre-se$")
    public void clico_em_Cadastre_se() throws Throwable {
        this.homePage.clicarCadastro();
    }

    @Quando("^preencher o usuario \"(.*?)\"$")
    public void preencher_o_usuario(String usuarioCadastro) throws Throwable {
        this.cadastrePage.inserirUsuario(usuarioCadastro);
        usuario = usuarioCadastro;
    }

    @Quando("^preencher a Senha \"(.*?)\"$")
    public void preencher_a_Senha(String senhaCadastro) throws Throwable {
        this.cadastrePage.inserirSenha(senhaCadastro);
        senha = senhaCadastro;
    }

    @Quando("^preencher a Confirme a Senha \"(.*?)\"$")
    public void preencher_a_Confirme_a_Senha(String confirmaSenha) throws Throwable {
        this.cadastrePage.inserirConfirmaSenha(confirmaSenha);
    }

    @Quando("^clicar em Cadastre-se$")
    public void clicar_em_Cadastre_se() throws Throwable {
        this.cadastrePage.clicarElementoCadastre();
    }

    @Então("^validar que a conta foi cadastrada$")
    public void validar_que_a_conta_foi_cadastrada() throws Throwable {
        this.homePage.inserirUsuario(usuario).inserirSenha(senha).clicarEntrar();
        this.listaDeFuncionariosPage.validarTelaListaDeFuncionarios();
    }

}