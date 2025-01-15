package com.orangelive.ORANGELIVE.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FormularioCandidatoUI {

    public static final Target INPUT_FIRST_NAME_CSS = Target.the("Campo de nombre del candidato")
            .locatedBy("//input[@name='firstName']");

    public static final Target INPUT_MIDDLE_NAME = Target.the("Campo de nombre medio del candidato")
            .locatedBy("//input[@name='middleName']");

    public static final Target INPUT_LAST_NAME_CSS = Target.the("Campo de apellido del candidato")
            .locatedBy("//input[@name='lastName']");

    public static final Target INPUT_EMAIL = Target.the("Campo de email")
            .locatedBy("//div[@data-v-957b4417]//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']");

    public static final Target INPUT_PHONE = Target.the("Campo de numero")
            .locatedBy("//div[@data-v-957b4417]//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']");

    public static final Target BTN_SAVE = Target.the("Campo de numero")
            .locatedBy("//button[@type='submit' and contains(@class, 'oxd-button') and contains(@class, 'oxd-button--secondary')]");

    public static final Target CHECKBOX = Target.the("Campo de apellido del candidato")
            .locatedBy("//label[@data-v-6179b72a]//input[@type='checkbox']");

    public static final Target BTN_PUESTO = Target.the("Vacancy dropdown button")
            .located(By.xpath("//div[@class='oxd-select-text--after']")); //
  public static final Target BTN_RECRUITMEN = Target.the("boton recluta")
            .located(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']"));

    public static final Target DROPDOWN_CONTENEDOR = Target.the("Dropdown container")
            .located(By.xpath("//div[@role='listbox']"));

    // Método dinámico para localizar una opción específica
    public static Target SELECT_PUESTO_OPTION(String puesto) {
        return Target.the("Option " + puesto)
                .located(By.xpath("//div[@role='listbox']//div[@role='option' and span[text()='" + puesto + "']]"));
    }

}
