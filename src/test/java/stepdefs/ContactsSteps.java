package stepdefs;

import com.codeborne.selenide.Condition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;
import static utils.Locators.*;

public class ContactsSteps {
    @Given("user on homepage")
    public void userOnHomepage() {
        open(url);
    }

    @And("user navigates to Contact page")
    public void userNavigatesToContactPage() {
        $(contactFooterLink).scrollTo().click();

    }

    @And("user accept cookies")
    public void userAcceptCookies() {
        sleep(1000);
        if ($(cookieAcceptButton).isDisplayed())
            $(cookieAcceptButton).click();


    }


    @When("user fills the form as follow")
    public void userFillsTheFormAsFollow(DataTable dataTable) {

        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);//String.class yazmasakda String alir
        for (Map<String, String> map : maps) {
            refresh();
            $(nameContactFormInput).setValue(map.get("name"));
            $(emailContactFormInput).setValue(map.get("email"));
            $(subjectContactFormInput).setValue(map.get("subject"));
            $(newsContactFormTextarea).setValue(map.get("news"));
            $(acceptContactFormCheckbox).shouldBe(Condition.visible).click();
            $(submitContactForm).click();
            $$(errorNotifications).shouldHaveSize(Integer.parseInt(map.get("errorNumber")));
            if (map.get("errorNumber").equals("0")) {
                $(alertSuccess)
                        .shouldBe(Condition.visible)
                        .shouldHave(Condition.attributeMatching("class", ".*success.*"));//basinda sonunda birden fazla char olabilir demek

            }

        }


    }
}
