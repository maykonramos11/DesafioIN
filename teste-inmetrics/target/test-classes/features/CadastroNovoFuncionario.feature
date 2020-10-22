#language: pt
Funcionalidade: Cadastrar Novo Funcionarios
  Contexto:
    Dado que realize login com o usuario "maykonramos" e senha "1234"
    E acesse a lista de funcionarios
    Quando clico em Novo Funcionario
    E preencher o Nome "FernandoTeste2"
    E preencher o CPF "1234"
    E preencher o Sexo "Masculino"
    E preencher a Admissao "10/10/2020"
    E preencher a Carga "Pesada"
    E preencher Salario "200"
    E preencher Tipo de Contratacao
    E clicar em Enviar

  @desafio4 @web
  Cenario: Cadastro de novo funcionario