package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion del modulo de productos")
    public Boolean titleIsVisible() {
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed() {
        return lbl_errorMessage.isDisplayed();
    }

    @Step("Validar los productos listados en el carrito")
    public Boolean productsAreDisplayed() {
        for(WebElementFacade product:productsList) {
            if (product.isDisplayed()) {
                return true;
            }
        }
        return false;
    }

    @Step("Validar que el carrito esta vacio de productos")
    public Boolean shoppingCartIsEmpty(){
        for (WebElementFacade product : productsList) {
            if (!product.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    @Step("Validar finalizacion de orden")
    public Boolean orderTextIsDisplayed() {
        return lbl_order.isDisplayed();
    }
}
