$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Cadastro",
  "description": "",
  "id": "cadastro",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 12374435700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Cadastro de usuario",
  "description": "",
  "id": "cadastro;cadastro-de-usuario",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 4,
      "name": "@desafio1"
    },
    {
      "line": 4,
      "name": "@web"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "que acesse o imrobot",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "clico em Cadastre-se",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "preencher o usuario \"FernandoTeste22\"",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "preencher a Senha \"1234\"",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "preencher a Confirme a Senha \"1234\"",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "clicar em Cadastre-se",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "validar que a conta foi cadastrada",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroStep.que_acesse_o_imrobot()"
});
formatter.result({
  "duration": 345490400,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStep.clico_em_Cadastre_se()"
});
formatter.result({
  "duration": 1385787900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FernandoTeste22",
      "offset": 21
    }
  ],
  "location": "CadastroStep.preencher_o_usuario(String)"
});
formatter.result({
  "duration": 302376200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 19
    }
  ],
  "location": "CadastroStep.preencher_a_Senha(String)"
});
formatter.result({
  "duration": 226336700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 30
    }
  ],
  "location": "CadastroStep.preencher_a_Confirme_a_Senha(String)"
});
formatter.result({
  "duration": 170984600,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStep.clicar_em_Cadastre_se()"
});
formatter.result({
  "duration": 1479978500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStep.validar_que_a_conta_foi_cadastrada()"
});
formatter.result({
  "duration": 28415293600,
  "status": "passed"
});
formatter.after({
  "duration": 919591300,
  "status": "passed"
});
});