package com.orangelive.ORANGELIVE.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AgregarCandidatoUI {

    public static final Target BTN_SECCION_HR = Target.the("Dirigirse hacia al panel").locatedBy("//li[contains(@class, 'oxd-main-menu-item-wrapper')]//a[contains(@class, 'oxd-main-menu-item') and @href='/web/index.php/recruitment/viewRecruitmentModule']");

    public static final Target BTN_ADD = Target.the("Botón 'Add' en el header")
            .locatedBy("//button[contains(text(),'Add') and contains(@class, 'oxd-button--medium')]");

    public static final Target BTN_ADD_CSS = Target.the("Botón 'Add' en el header")
            .locatedBy("div.orangehrm-header-container button.oxd-button.oxd-button--medium.oxd-button--secondary");


}
