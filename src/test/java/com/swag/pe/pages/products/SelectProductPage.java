package com.swag.pe.pages.products;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectProductPage extends PageObject {

    @FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
    protected List<WebElementFacade> products;

    @FindBy(xpath = "//*[local-name()='svg']//ancestor::a")
    protected WebElementFacade shoppingCartIcon;

    // Método que funciona usando el driver directamente pero con el XPath centralizado
    public List<WebElement> getProductButtons() {
        return getDriver().findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));
    }

    public WebElement getCartIcon() {
        return getDriver().findElement(By.xpath("//*[local-name()='svg']//ancestor::a"));
    }
}