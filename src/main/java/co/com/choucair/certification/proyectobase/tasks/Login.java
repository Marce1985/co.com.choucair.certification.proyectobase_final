package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.RegisterUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Date;

public class Login implements Task {
    private String strNameUser;
    private String strLastName;
    private String strEmail;
    private Date dateBirthdate;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strOsComputer;
    private String strVersionComputer;
    private String strLanguage;
    private String strMobileDevice;
    private String strModelDevice;
    private String strOSDevice;
    private String strPassword;
    private String strConfirmPassword;
    public Login(String strNameUser,String strLastName,String strEmail,String strPassword,String strConfirmPassword){
        this.strNameUser=strNameUser;
        this.strLastName=strLastName;
        this.strEmail=strEmail;
        this.dateBirthdate=dateBirthdate;
        this.strCity=strCity;
        this.strZip=strZip;
        this.strCountry=strCountry;
        this.strOsComputer=strOsComputer;
        this.strVersionComputer=strVersionComputer;
        this.strLanguage=strLanguage;
        this.strMobileDevice=strMobileDevice;
        this.strModelDevice=strModelDevice;
        this.strOSDevice=strOSDevice;
        this.strPassword=strPassword;
        this.strConfirmPassword=strConfirmPassword;

    }

    public static Login onThePage(String strNameUser,String strLastName,String strEmail,String strPassword,String strConfirmPassword) {
        return Tasks.instrumented(Login.class,strNameUser,strLastName,strEmail, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strNameUser).into(RegisterUtestPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(RegisterUtestPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(RegisterUtestPage.EMAIL_ADDRESS),
                Click.on(RegisterUtestPage.MONTH_BIRTH),
                Click.on(RegisterUtestPage.DAY_BIRTH),
                Click.on(RegisterUtestPage.YEAR_BIRTH),
                Click.on(RegisterUtestPage.LANGUAGES_SPOKEN),
                Click.on(RegisterUtestPage.NEXT_LOCATION),


                Click.on(RegisterUtestPage.NEXT_DEVICES),



                Click.on(RegisterUtestPage.BUTTON_NEXT_STEP),

                Enter.theValue(strPassword).into(RegisterUtestPage.PASSWORD_USER),
                Enter.theValue(strConfirmPassword).into(RegisterUtestPage.CONFIRM_PASSWORD_USER),
                Click.on(RegisterUtestPage.TERM_OF_USE),
                Click.on(RegisterUtestPage.PRIVACY_SETTINGS),
                 Click.on(RegisterUtestPage.COMPLETE_SETUP)

                );
    }
}
