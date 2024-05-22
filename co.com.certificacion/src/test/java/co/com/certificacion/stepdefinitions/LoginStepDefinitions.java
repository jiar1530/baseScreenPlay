package co.com.certificacion.stepdefinitions;

import co.com.certificacion.tasks.Login;
import co.com.certificacion.tasks.Navigate;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("that a {string} enters the portal")
    public void goToThePortal(String actor) {

        theActorCalled(actor).wasAbleTo(Navigate.openUrl());
    }

    @When("the user enters their {string} and {string}")
    public void enterTheCredentials(String username, String password) {

        theActorInTheSpotlight().attemptsTo(Login.addCredentiasls(username, password));
    }

}