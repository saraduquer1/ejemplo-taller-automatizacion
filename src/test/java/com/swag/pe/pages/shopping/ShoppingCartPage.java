package com.swag.pe.pages.shopping;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends PageObject {

    @FindBy(xpath = "//a[@class='btn_action checkout_button']")
    protected WebElementFacade checkoutButton;

    @FindBy(id = "first-name")
    protected WebElementFacade txt_firstname;

    @FindBy(id = "last-name")
    protected WebElementFacade txt_lastname;

    @FindBy(id = "postal-code")
    protected WebElementFacade txt_postal;

    @FindBy(xpath = "//input[@class='btn_primary cart_button']")
    protected WebElementFacade continueButton;

    @FindBy(xpath = "//a[@class='btn_action cart_button']")
    protected WebElementFacade finishButton;

    // Métodos que funcionan usando el driver directamente (mismo patrón que SelectProductPage)
    public WebElement getCheckoutButton() {
        return getDriver().findElement(By.xpath("//a[@class='btn_action checkout_button']"));
    }

    public WebElement getFirstNameField() {
        return getDriver().findElement(By.id("first-name"));
    }

    public WebElement getLastNameField() {
        return getDriver().findElement(By.id("last-name"));
    }

    public WebElement getPostalCodeField() {
        return getDriver().findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton() {
        return getDriver().findElement(By.xpath("//input[@class='btn_primary cart_button']"));
    }

    public WebElement getFinishButton() {
        return getDriver().findElement(By.xpath("//a[@class='btn_action cart_button']"));
    }
}