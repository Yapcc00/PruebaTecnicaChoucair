package com.orangelive.ORANGELIVE.stepdefinitions;

import com.orangelive.ORANGELIVE.tasks.*;
import com.orangelive.ORANGELIVE.userinterfaces.FormularioCandidatoUI;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class pruebaStepDefinitions {

    @Before
    public void IniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("que estoy en la pagina de inicio de sesion de OrangeHRM")
    public void queEstoyEnLaPaginaDeInicioDeSesionDeOrangeHRM() {
        OnStage.theActorCalled("Yeison").wasAbleTo(AbrirNavegador.onAbrir());
    }


    @Cuando("ingreso las credenciales proporcionadas")
    public void ingresoLasCredencialesProporcionadas() {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.Enter());
    }
    @Entonces("debo poder ver al candidato en la lista con el estado Hired")
    public void deboPoderVerAlCandidatoEnLaListaConElEstadoHired() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarCandidatoTask.EnterHR());
        OnStage.theActorInTheSpotlight().attemptsTo(FormularioCandidatoTask.EnterForm());
    }
}
