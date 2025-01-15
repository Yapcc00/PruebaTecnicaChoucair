package com.orangelive.ORANGELIVE.tasks;

import com.orangelive.ORANGELIVE.questions.ValidarStatus;
import com.orangelive.ORANGELIVE.userinterfaces.FormularioCandidatoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import static com.orangelive.ORANGELIVE.userinterfaces.FormularioCandidatoUI.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.core.IsEqual.equalTo;

public class FormularioCandidatoTask implements Task {
    WebDriver driver;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("oscar").into(FormularioCandidatoUI.INPUT_FIRST_NAME_CSS));
        actor.attemptsTo(Enter.theValue("andres").into(FormularioCandidatoUI.INPUT_MIDDLE_NAME));
        actor.attemptsTo(Enter.theValue("roa").into(FormularioCandidatoUI.INPUT_LAST_NAME_CSS));
        actor.attemptsTo(Enter.theValue("oscarandres@gmail.com").into(FormularioCandidatoUI.INPUT_EMAIL));
        actor.attemptsTo(Enter.theValue("45346564347").into(FormularioCandidatoUI.INPUT_PHONE));
        actor.attemptsTo(
                //el botón del dropdown esté visible
                WaitUntil.the(FormularioCandidatoUI.BTN_PUESTO, isVisible()).forNoMoreThan(10).seconds(),

                // botón para desplegar las opciones
                Click.on(FormularioCandidatoUI.BTN_PUESTO),

                // Espera a que el dropdown esté visible
                WaitUntil.the(FormularioCandidatoUI.DROPDOWN_CONTENEDOR, isVisible()).forNoMoreThan(5).seconds(),

                // Espera a que la opción deseada sea visible y haz clic en ella
                WaitUntil.the(FormularioCandidatoUI.SELECT_PUESTO_OPTION("Payroll Administrator"), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(FormularioCandidatoUI.SELECT_PUESTO_OPTION("Payroll Administrator"))
        );
        actor.attemptsTo(Click.on(BTN_SAVE));

        actor.attemptsTo(Click.on(BTN_RECRUITMEN));

        actor.should(seeThat(ValidarStatus.enLaTabla(), equalTo(true)));

    }

    public static FormularioCandidatoTask EnterForm() {
        return Tasks.instrumented(FormularioCandidatoTask.class);
    }
}
