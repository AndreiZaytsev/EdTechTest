package ru.TalentTech;

import com.github.javafaker.Company;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class RegistrationFormTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();

    String policyCheckbox = "[name=policy]";
    String agreeCheckbox = "[name=agree]";
    static Company companyName;
    static String fullName,
            email,
            phoneNumber;

    @BeforeEach
    void prepareTestData() {
        fullName = faker.name().fullName();
        email = faker.internet().emailAddress();
        phoneNumber = faker.phoneNumber().subscriberNumber(10);
        companyName = faker.company();
    }

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFullName(fullName)
                .setEmail(email)
                .setCompanyName(String.valueOf(companyName))
                .setPhoneNumber(phoneNumber);


        $(".dropdown").click();
        $("[data-value='До 100 человек']").click();
        $(policyCheckbox).click();
        $(agreeCheckbox).click();
    }

}

