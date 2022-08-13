package co.com.tevolvers.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Formulario extends PageObject {

    public static final Target TXTFIRSTNAME = Target.the("texto firstname")
            .located(By.xpath("//input[@id='firstName']"));

    public static final Target TXTLASTNAME = Target.the("texto firstname")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target TXTUSERMAIL = Target.the("texto email")
            .located(By.xpath("//input[@id='userEmail']"));

    public static final Target CHECKGENDER= Target.the("chek gender")
            .locatedBy("//label[contains(text(),'{0}')]");

    public static final Target TXTUSERNUMBER = Target.the("texto user number")
            .located(By.xpath("//input[@id='userNumber']"));

    public static final Target CHECKHOBBIES= Target.the("chek hobies")
            .locatedBy("//label[contains(text(),'{0}')]");

    public static final Target BTNSELECTPICTURE= Target.the("botón select picture")
            .locatedBy("//div[@class='form-file']//input[@id='uploadPicture']");

    public static final Target TXTCURRENTADDRESS = Target.the("texto current address")
            .located(By.xpath("//textarea[@id='currentAddress']"));

    public static final Target SELECT_STATE= Target.the("select state")
            .locatedBy("//div[@class=' css-1uccc91-singleValue'][contains(text(), '{0}')]");

    public static final Target SELECT_CITY= Target.the("select city")
            .locatedBy("//div[@class=' css-1uccc91-singleValue'][contains(text(), '{0}')]");

    public static final Target BTNSUBMIT= Target.the("botón  submit")
            .locatedBy("//button[@id='submit']");





    /*
    public static final Target SELECT_MONTH= Target.the("select month")
            .locatedBy("//div//select[@id='birthMonth']//option[contains(text(),'{0}')]");
    */
}
