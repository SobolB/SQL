package ru.netology.banklogin.page;

import ru.netology.banklogin.data.DataHelper;

public class LoginPage {
    @FindBy(css = "[data-test-id=login] input")
    private SelenideElement loginField;

    @FindBy(css = "[data-test-id=password] input")
    private SelenideElement passwordField;

    @FindBy(css = "[data-test-id=action-login]")
    private SelenideElement loginButton;

    @FindBy(css = "[data-test-id='error-notification']")
    private SelenideElement errorNotification;

    public void verifyErrorNotificationVisiblity(){errorNotification.shouldBe(visible);}

    public VerificationPage validLogin(DataHelper.AuthInfo info){
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        loginButton.click();
        return new VerificationPage();
    }
}
