package stepdefs;

import static com.codeborne.selenide.Selenide.*;
import static utils.Locators.*;

import com.codeborne.selenide.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.Map;

public class CableProductsSteps {
    @And("user navigates to Cable page")
    public void userNavigatesToCablePage() {
        if($(toggleMobileMenu).isDisplayed()){
            $(toggleMobileMenu).click();
            $(kabel_mainMobile).click();
        }else
        $(cableLinkMenu).shouldBe(Condition.visible).click();
    }

    @When("user selects the {int} .th product")
    public void userSelectsTheProductNumberThProduct(int productNumber) {

        ElementsCollection products = $$(kabelProductPrices);
        SelenideElement product = products.get(productNumber - 1);
        product.click();

    }

    @Then("user clicks warenKorb")
    public void userClicksWarenKorb() {

        $(goTocartButton).scrollTo().shouldBe(Condition.visible).click();


    }


    @And("user clicks {int} .th option")
    public void userClicksThOption(int index) {

        $(priceBox).shouldBe(Condition.visible);


        ElementsCollection extras = $$(extraTalkCheckBoxes);
        SelenideElement extra = extras.get(index - 1);
        extra.click();

        $(priceBox).shouldHave(Condition.text(extra.parent().find("h4").getText()));
        $(jetztBestellenBtn).click();


    }

    @And("user fills personal infos page")
    public void userFillsPersonalInfosPage(DataTable dataTable) {

        Map<String, String> persInfForm = dataTable.asMap(String.class, String.class);
        if (persInfForm.get("anrede") == null)
            $(genderSelect).shouldBe(Condition.visible).selectOption("Herr");
        else
            $(genderSelect).shouldBe(Condition.visible).selectOption(persInfForm.get("anrede"));

        if (persInfForm.get("titel") != null)
            $(titleSelect).shouldBe(Condition.visible).selectOption(persInfForm.get("titel"));


        if (persInfForm.get("vorname") != null)
            $(nameInput).shouldBe(Condition.visible).setValue(persInfForm.get("vorname"));


        if (persInfForm.get("nachname") != null)
            $(surnameInput).shouldBe(Condition.visible).setValue(persInfForm.get("nachname"));
        if (persInfForm.get("telefon") != null)
            $(telephonInput).shouldBe(Condition.visible).setValue(persInfForm.get("telefon"));
        if (persInfForm.get("e-Mail") != null)
            $(emailInput).shouldBe(Condition.visible).setValue(persInfForm.get("e-Mail"));
        if (persInfForm.get("pLZ") != null)
            $(postCodeInput).shouldBe(Condition.visible).setValue(persInfForm.get("pLZ"));
        if (persInfForm.get("wohnort") != null)
            $(cityInput).shouldBe(Condition.visible).setValue(persInfForm.get("wohnort"));
        if (persInfForm.get("strasse") != null)
            $(streetInput).shouldBe(Condition.visible).setValue(persInfForm.get("strasse"));
        if (persInfForm.get("hausnummer") != null)
            $(houseNumberInput).scrollTo().shouldBe(Condition.visible).setValue(persInfForm.get("hausnummer"));


    }

    @And("user fills ID card infos")
    public void userFillsIDCardInfos(DataTable dataTable) {
        Map<String, String> idForm = dataTable.asMap(String.class, String.class);
        if (idForm.get("Ausweisart") != null)
            $(idTypeSelect).scrollTo().shouldBe(Condition.visible).selectOption(idForm.get("Ausweisart"));
        if (idForm.get("Ausstellungsort") != null)
            $(idPlaceOfIssueInput).shouldBe(Condition.exist).setValue(idForm.get("Ausstellungsort"));
        if (idForm.get("Geburtsdatum") != null)
            $(dateOfBirthInput).setValue(idForm.get("Geburtsdatum"));
        if (idForm.get("Geburtsort") != null)
            $(birthOfPlaceInput).setValue(idForm.get("Geburtsort"));
        if (idForm.get("Gültigkeit") != null)
            $(expiryDateInput).setValue(idForm.get("Gültigkeit"));
        if (idForm.get("Ausweisnummer") != null)
            $(idNumberInput).setValue(idForm.get("Ausweisnummer"));



    }

    @Then("user fills Bank Infos")
    public void userFillsBankInfos(DataTable dataTable) {
        Map<String, String> bankForm = dataTable.asMap(String.class, String.class);
        if (bankForm.get("IBAN") != null)
            $(ibanInput).shouldBe(Condition.exist).scrollTo().setValue(bankForm.get("IBAN"));


        $(shippingRadioInput).scrollTo().shouldBe(Condition.exist).click();
        $(jetztBestellenWeiterBtn).click();



    }

    @Given("browser size as {string}")
    public void browserSizeAs(String browserSize) {
        Configuration.browserSize =browserSize;

    }

    @And("close the browser")
    public void closeTheBrowser() {
        WebDriverRunner.driver().close();

    }
}
