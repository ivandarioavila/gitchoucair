package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStep {
    @Before

    public void  setUp()
    {
        OnStage.setTheStage(new OnlineCast())
    }

    @Given("^El cliente abre la  pagina web$")
    public void el_cliente_abre_la_pagina_web()  {
        theActorCalled(requiredActor:"cliente").attemptsTo(Open.url(targetUrl:"https://www.utest.com/signup/personal"));
    }

    @When("^El cliente (.+) y (.+)$")
    public void el_cliente_y(String firstname, String lastname)  {
    }

    @Then("^debo validar datos (.+)$")
    public void debo_validar_datos(String validatexto) {
    }

}
