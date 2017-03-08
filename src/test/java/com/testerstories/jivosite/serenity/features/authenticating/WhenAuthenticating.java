package com.testerstories.jivosite.serenity.features.authenticating;

import com.testerstories.jivosite.serenity.steps.JivositeUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenAuthenticating {

    @Steps
    private JivositeUser user;

    @Managed(driver = "chrome")
    WebDriver browser;

    @Test
    public void shouldBeAbleToLogin() {
        user.isOnLoginPage();

        user.logsInWithCorrectCredentials();

        user.shouldBeOnAdminPanel();

    }

}
