package com.swag.pe.utilities.website;

import com.swag.pe.steps.login.LoginStep;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class WebSite {

    @Steps(shared = true)
    PageObject swag;

    @Step("Navegar al sitio web")
    public void navigateTo(String url) {
        swag.setDefaultBaseUrl(url);
        swag.open();
    }
}
