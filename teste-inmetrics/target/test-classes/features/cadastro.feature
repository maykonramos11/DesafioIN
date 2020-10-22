#language: pt
Funcionalidade: Cadastro

  @desafio1 @web
  Cenario: Cadastro de usuario
    Dado que acesse o imrobot
    Quando clico em Cadastre-se
    E preencher o usuario "FernandoTeste22"
    E preencher a Senha "1234"
    E preencher a Confirme a Senha "1234"
    E clicar em Cadastre-se
    Então validar que a conta foi cadastrada