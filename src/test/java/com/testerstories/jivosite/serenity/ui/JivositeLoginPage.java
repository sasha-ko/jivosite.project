package com.testerstories.jivosite.serenity.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://admin.jivosite.com/")
public class JivositeLoginPage extends PageObject{
    @FindBy(css = "input.button.blue")
    WebElement loginButton;

    public void login() {
        $("#email").sendKeys("sashkins.bookmate@yandex.ru");
        $("#password").sendKeys("1234567QA");
        loginButton.click();
    }

    public boolean loginError() {
        $("#email").sendKeys("sashkins.bookmate@yandex.ru");
        $("#password").sendKeys("1234567");
        loginButton.click();
        return containsElements("span.error");
    }
}
