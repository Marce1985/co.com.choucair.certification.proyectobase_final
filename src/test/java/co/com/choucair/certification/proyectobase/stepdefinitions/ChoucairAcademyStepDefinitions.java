package co.com.choucair.certification.proyectobase.stepdefinitions;


import co.com.choucair.certification.proyectobase.model.UtestData;
import co.com.choucair.certification.proyectobase.questions.Answer_1;

import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import org.mockito.internal.stubbing.answers.ThrowsException;
import org.mockito.stubbing.Answer;

import javax.security.auth.login.LoginContext;
import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Mathew wants to login at Utest$")
    public void thanMathewWantsToLoginAtUtest(List<UtestData> utestData)throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Mathew").wasAbleTo(OpenUp.thePage(),Login.onThePage(utestData.get(0).getStrNameUser(),utestData.get(0).getStrLastName(),utestData.get(0).getStrEmail(), utestData.get(0).getStrPassword(), utestData.get(0).getStrConfirmPassword())
    );
    }

    @When("^he register for the Utest$")
    public void heRegisterForTheUtest(List<UtestData> utestData ) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(utestData.get(0).getStrWelcomeTitle()));
    }

    @Then("^He can in to the Utest plataform$")
    public void heCanInToTheUtestPlataform(List<UtestData> utestData)throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer_1.toThe(utestData.get(0).getStrWelcomeTitle())));
    }


}
