package com.orangelive.ORANGELIVE.tasks;

import com.orangelive.ORANGELIVE.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Admin").into(LoginUI.TXT_USUARIO));
        actor.attemptsTo(Enter.theValue("admin123").into(LoginUI.TXT_CONTRASENA));
        actor.attemptsTo(Click.on(LoginUI.BTN_LOGIN));
    }

    public static LoginTask Enter(){
        return Tasks.instrumented(LoginTask.class);
    }
}