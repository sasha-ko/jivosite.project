package com.testerstories.jivosite.serenity.steps;

import com.testerstories.jivosite.serenity.ui.JivositeLoginPage;
import com.testerstories.jivosite.serenity.ui.AdminPanel;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class JivositeUser {
    private JivositeLoginPage jivositeLoginPage;
    private AdminPanel adminPanel;

    @Step
    public void isOnLoginPage() {

        jivositeLoginPage.open();
    }

    @Step
    public void logsInWithCorrectCredentials() {
        jivositeLoginPage.login();
    }

    @Step
    public void shouldBeOnAdminPanel() {
        adminPanel.isLogoutVisible();
    }

    @Step
    public void logsInWithIncorrectCredentials() {
        jivositeLoginPage.loginError();
    }
}
