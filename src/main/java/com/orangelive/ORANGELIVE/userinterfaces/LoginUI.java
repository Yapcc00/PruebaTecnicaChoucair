package com.orangelive.ORANGELIVE.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target TXT_USUARIO = Target.the("ingresar usuario").locatedBy("//input[@name='username']");
    public static final Target TXT_CONTRASENA = Target.the("ingresar contraseña").locatedBy("//input[@name='password']");
    public static final Target BTN_LOGIN = Target.the("ingresar HRM").locatedBy("//button[contains(@class, 'orangehrm-login-button')]");
}
