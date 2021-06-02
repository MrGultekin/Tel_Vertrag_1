package stepdefs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static com.codeborne.selenide.Selenide.*;
import static utils.Locators.*;

public class NewsletterSteps {

    @And("user subscribes newsletter as {string}")
    public void userSubscribesNewsletterAs(String email) {
        $(newsletterEmailRegistrationInput).scrollTo().setValue(email);
        $(newsletterEmailRegistrationButton).click();
        sleep(3000);




    }
    @Then("user unsubscribes from newsletter")
    public void userUnsubscribesFromNewsletter(String email) {

        $(newsletterEmailUnRegistrationLink).shouldBe(Condition.exist).click();

        sleep(3000);
        $(newsletterEmailUnRegistrationInput).shouldBe(Condition.visible).setValue(email);
        $(jetzAnmeldenMailButton).click();


    }

    @Then("user unsubscribes from newsletter as {string}")
    public void userUnsubscribesFromNewsletterAs(String mail) {

        $(newsletterEmailUnRegistrationLink).shouldBe(Condition.exist).click();

        sleep(3000);
        $(newsletterEmailUnRegistrationInput).shouldBe(Condition.visible).setValue(mail);
        $(jetzAnmeldenMailButton).click();

    }
}
