package com.swag.pe.steps.products;

import com.swag.pe.pages.products.SelectProductPage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class SelectProductStep extends SelectProductPage {

    @Step("Agregar productos al carrito de compras")
    public void addProducts(int quantity){
        for (int i = 0; i < quantity; i++) {
            Actions act = new Actions(getDriver());
            act.click(products.get(i)).perform();
        }
    }

    @Step("Click en el icono del carrito de compras")
    public void clickShoppingCartIcon(){
        shoppingCartIcon.click();
    }
}
