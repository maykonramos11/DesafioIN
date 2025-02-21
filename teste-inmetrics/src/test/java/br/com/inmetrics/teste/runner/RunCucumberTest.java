package br.com.inmetrics.teste.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        format = "json:target/integration_cucumber.json",
        tags = {"@desafio1"},
        glue = "",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports" },
        monochrome = true)

public class RunCucumberTest {
}