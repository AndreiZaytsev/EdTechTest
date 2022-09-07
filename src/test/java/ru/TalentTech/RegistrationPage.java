package ru.TalentTech;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationPage {



    private SelenideElement
            fullNameInput = $("[name=your-name]"),
            emailInput = $("[name=email]"),
            phoneNumberInput = $("[name=your-tel]"),
            companyNameInput = $("[name=company-name]");



    private final static String TITLE_TEXT = "Умные HR-решения";

    public RegistrationPage openPage() {
        open("https://talenttech.ru/");
        $("h1 span").shouldHave(text(TITLE_TEXT));
        return this;
    }

    public RegistrationPage setFullName(String name) {
        fullNameInput.setValue(name);

        return this;
    }

    public RegistrationPage setEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    public RegistrationPage setPhoneNumber(String number) {
        phoneNumberInput.setValue(number);

        return this;
    }

    public RegistrationPage setCompanyName(String name) {
        companyNameInput.setValue(name);

        return this;
    }
}
