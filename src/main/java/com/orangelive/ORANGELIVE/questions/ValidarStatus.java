package com.orangelive.ORANGELIVE.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.stream.Collectors;

public class ValidarStatus implements Question<Boolean> {


    private static final Target STATUS_COLUMN = Target.the("columna de status")
            .locatedBy("//div[@class='oxd-table-cell oxd-padding-cell']//div[text()='Application Initiated']");

    @Override
    public Boolean answeredBy(Actor actor) {
        // Obtiene todos los elementos de la columna "Status"
        List<String> statuses = STATUS_COLUMN.resolveAllFor(actor).stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());

        // Valida que todas las filas tengan el texto "Application Initiated"
        return statuses.stream().allMatch(status -> status.equals("Application Initiated"));
    }

    public static ValidarStatus enLaTabla() {
        return new ValidarStatus();
    }
}
