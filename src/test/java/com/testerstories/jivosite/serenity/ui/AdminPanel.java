package com.testerstories.jivosite.serenity.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class AdminPanel extends PageObject {
    @FindBy(css = "a.dropdown-toggle")
    WebElement dropdownButton;

    public boolean isLogoutVisible() {
        dropdownButton.click();
        return containsElements("a[href='/auth/logout']");
    }
}
