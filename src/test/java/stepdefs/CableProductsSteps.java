package stepdefs;
import static com.codeborne.selenide.Selenide.*;
import static utils.Locators.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.*;

public class CableProductsSteps {
    @And("user navigates to Cable page")
    public void userNavigatesToCablePage() {
        $(cableLinkMenu).shouldBe(Condition.visible).click();
    }

    @When("user selects the {int} .th product")
    public void userSelectsTheProductNumberThProduct(int productNumber) {

        ElementsCollection products = $$(kabelProductPrices);
        SelenideElement product = products.get(productNumber-1);
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
        SelenideElement extra = extras.get(index-1);
        extra.click();

        $(priceBox).shouldHave(Condition.text(extra.parent().find("h4 span").getText()));
        $(jetztBestellenBtn).click();



    }
}
