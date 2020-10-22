package br.com.inmetrics.page;

import org.openqa.selenium.support.PageFactory;
import util.Util;

public class CadastrePage extends Util {

    public CadastrePage (){
        PageFactory.initElements(getDriver(), this);
    }
}
