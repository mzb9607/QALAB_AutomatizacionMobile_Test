package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class LoginStepsDef {


    @Steps
    LoginSteps loginSteps;
    @Steps
    InventorySteps inventorySteps;

    @Dado("que me encuentro en la pantalla de login de SwagLabs")
    public void que_me_encuentro_en_la_pantalla_de_login_de_SwagLabs() {

    }

    @Cuando("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String user, String password) {
        loginSteps.login(user, password);
    }


    @Entonces("valido que debería aparecer el título de {string}")
    public void valido_que_deberia_aparecer_el_titulo_de(String expectedTitle) {
        inventorySteps.testTitleText(expectedTitle);
    }

    @Y("también valido que al menos exista un item")
    public void también_valido_que_al_menos_exista_un_item() {

    }

}
