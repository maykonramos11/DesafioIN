import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.Util;

public class Hooks extends Util {

    @Before("@web")
    public void iniciar(Scenario scenario) throws Exception {
        init("CHROME", "http://www.inmrobo.tk/accounts/login/");
    }

    @After("@web")
    public void fechar(Scenario scenario) throws Exception {
        quit();
    }
}