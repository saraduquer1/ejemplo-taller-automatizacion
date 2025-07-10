package com.swag.pe.steps.shopping;

import com.swag.pe.pages.shopping.ShoppingCartPage;
import net.serenitybdd.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {

    @Step("Click en checkout")
    public void clickCheckoutButton(){
        waitABit(1000);

        if (checkoutButton != null && checkoutButton.isDisplayed()) {
            checkoutButton.click();
        } else {
            getCheckoutButton().click();
        }
    }

    @Step("Ingresar nombre")
    public void typeFirstName(String firstName){
        waitABit(500);

        if (txt_firstname != null && txt_firstname.isDisplayed()) {
            txt_firstname.sendKeys(firstName);
        } else {
            getFirstNameField().sendKeys(firstName);
        }
    }

    @Step("Ingresar apellido")
    public void typeLastName(String lastName){
        waitABit(500);

        if (txt_lastname != null && txt_lastname.isDisplayed()) {
            txt_lastname.sendKeys(lastName);
        } else {
            getLastNameField().sendKeys(lastName);
        }
    }

    @Step("Ingresar codigo postal")
    public void typePostal(String postal){
        waitABit(500);

        if (txt_postal != null && txt_postal.isDisplayed()) {
            txt_postal.sendKeys(postal);
        } else {
            getPostalCodeField().sendKeys(postal);
        }
    }

    @Step("Click en continuar")
    public void clickContinue() {
        waitABit(500);

        if (continueButton != null && continueButton.isDisplayed()) {
            continueButton.click();
        } else {
            getContinueButton().click();
        }
    }

    @Step("Click en finalizar")
    public void clickFinish() {
        waitABit(500);

        if (finishButton != null && finishButton.isDisplayed()) {
            finishButton.click();
        } else {
            getFinishButton().click();
        }
    }
}