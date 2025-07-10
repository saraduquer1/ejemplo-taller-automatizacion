package com.swag.pe.steps.products;

import com.swag.pe.pages.products.SelectProductPage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SelectProductStep extends SelectProductPage {

    @Step("Agregar productos al carrito de compras")
    public void addProducts(int quantity){
        waitABit(2000);

        List<WebElement> productButtons = getProductButtons();
        validateProductsFound(productButtons);
        addProductsToCart(productButtons, quantity);
    }

    @Step("Click en el icono del carrito de compras")
    public void clickShoppingCartIcon(){
        waitABit(1000);

        if (shoppingCartIcon != null && shoppingCartIcon.isDisplayed()) {
            shoppingCartIcon.click();
        } else {
            getCartIcon().click();
        }
    }

    private void validateProductsFound(List<WebElement> productButtons) {
        if (productButtons.isEmpty()) {
            throw new RuntimeException("No se encontraron productos para agregar al carrito");
        }
    }

    private void addProductsToCart(List<WebElement> productButtons, int quantity) {
        for (int i = 0; i < quantity && i < productButtons.size(); i++) {
            WebElement button = productButtons.get(i);
            if (button.isDisplayed() && button.isEnabled()) {
                clickProduct(button);
                waitABit(500);
            }
        }
    }

    private void clickProduct(WebElement button) {
        Actions act = new Actions(getDriver());
        act.click(button).perform();
    }
}