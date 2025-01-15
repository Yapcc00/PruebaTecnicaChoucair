package com.orangelive.ORANGELIVE.tasks;

import com.orangelive.ORANGELIVE.userinterfaces.AgregarCandidatoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarCandidatoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AgregarCandidatoUI.BTN_SECCION_HR));
        actor.attemptsTo(Click.on(AgregarCandidatoUI.BTN_ADD_CSS));
    }

    public static AgregarCandidatoTask EnterHR(){
        return Tasks.instrumented(AgregarCandidatoTask.class);
    }
}
