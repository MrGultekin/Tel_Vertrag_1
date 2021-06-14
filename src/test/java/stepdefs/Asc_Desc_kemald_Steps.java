package stepdefs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utils.Locators;

import static com.codeborne.selenide.Selenide.*;

public class Asc_Desc_kemald_Steps implements Locators {
    @Given("Navigate to Telefonvertrag home page")
    public void navigateToTelefonvertragHomePage() {

        open(urlTV);

        sleep(2000);
        $(acceptCookies).shouldBe(Condition.visible).hover().click();


    }


    @Then("^user check Kabel page functionality$")
    public void userCheckKabelPageFunctionality()  {


        $(kabel_main).click();
        filteringProducts();




    }

    public void filteringProducts() {
        sleep(1000);

        $(firstFilter).selectOption(1);                           //selectOptionContainingText("Vodafone");
        sleep(200);
        $(firstFilter).selectOption(0);                     //selectOptionContainingText("Alle");

        sleep(500);

        $(preisORtarifFilter).selectOption(1);            //    selectOptionContainingText("< 20 Euro");


        {
            int sayac = 0;
            for (int i = 0; i < tabs.size(); i++) {

                String preisText = productPrice_out.get(i).text().trim().replaceAll("[*€]", "").substring(0, 2);
                System.out.println(preisText);

                int newPreis = Integer.parseInt(preisText);

                if (newPreis < 20) {
                    sayac++;

                }


            }
            int ppList = productPrice_out.size();
            System.out.println(sayac);
            Assert.assertEquals(sayac, ppList);
        }

        $(preisORtarifFilter).selectOption(2); //.selectOptionContainingText("20-30 Euro"); // sleep(1000);

        {
            int sayac = 0;
            for (int  i = 0; i< tabs.size(); i++) {

                String preisText = productPrice_out.get(i).text().trim().replaceAll("[*€]", "").substring(0, 2);
                System.out.println(preisText);
                sleep(1000);
                int newPreis = Integer.parseInt(preisText);

                if (newPreis >= 20 && newPreis < 30) {
                    sayac++;
                }


            }
            int ppList = productPrice_out.size();
            System.out.println(sayac);
            Assert.assertEquals(sayac, ppList);
        }


        $(preisORtarifFilter).selectOption(3); //selectOptionContainingText("30-40 Euro"); //sleep(1000);


        {
            int sayac = 0;
            for ( int i = 0; i < tabs.size(); i++) {

                String preisText = productPrice_out.get(i).text().trim().replaceAll("[*€]", "").substring(0, 2);
                System.out.println(preisText);
                int newPreis = Integer.parseInt(preisText);

                if (newPreis >= 30 && newPreis < 40) {
                    sayac++;
                }


            }
            int ppList = productPrice_out.size();
            System.out.println(sayac);
            Assert.assertEquals(sayac, ppList);
        }

        $(preisORtarifFilter).selectOption(4);

        {
            int sayac = 0;
            for ( int i = 0; i < tabs.size(); i++) {

                String preisText = productPrice_out.get(i).text().trim().replaceAll("[*€]", "").substring(0, 2);
                System.out.println(preisText);
                int newPreis = Integer.parseInt(preisText);

                if (newPreis >= 40) {
                    sayac++;
                }


            }
            int ppList = productPrice_out.size();
            System.out.println(sayac);
            Assert.assertEquals(sayac, ppList);

        }

        $(preisORtarifFilter).selectOption(0);



        sleep(1000);  $(sortierenFilter).selectOption(1); //shouldBe(Condition.exist).selectOptionContainingText("Bezeichnung");
        sleep(400);  $(sortierenFilter).selectOption(2); //shouldBe(Condition.exist).selectOptionContainingText("Neuste Tarife");
        sleep(400); $(sortierenFilter).selectOption(3); //shouldBe(Condition.exist).selectOptionContainingText("Alte Tarife");
        sleep(400);  $(sortierenFilter).selectOption(4); //shouldBe(Condition.exist).selectOptionContainingText("Mtl. Preis aufsteigend");
        sleep(400);   $(sortierenFilter).selectOption(5); //shouldBe(Condition.exist).selectOptionContainingText("Mtl. Preis absteigend");
        sleep(400); $(sortierenFilter).selectOption(0); //shouldBe(Condition.exist).selectOptionContainingText("Unsere Empfehlungen");
        sleep(200);
        $(firstFilter).selectOption(0);

    }






}
