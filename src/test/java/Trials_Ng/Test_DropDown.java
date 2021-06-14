package Trials_Ng;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.Locators;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class Test_DropDown implements Locators {


    public void selectRandomFrom(By selectorOfSelect){

        int size =  $(selectorOfSelect).findAll("option").size();

        $(selectorOfSelect).selectOption(getRandom(size));
    }



    public int getRandom(int max) {

        return new Random().nextInt(max);

    }

    public int getRandom(int min, int max) {

        return min + new Random().nextInt(max-min);
    }


    @Test
    public void isProductsInAsc() {
       // Configuration.holdBrowserOpen = true;
        open("https://telefonvertrag.de/kabel/");
        $(cookieAcceptButton).shouldBe(Condition.visible).click();


        $(firstFilter).selectOption(0);

      //  int size =  $(preisORtarifFilter).findAll("option").size();
        for (int i = 0; i < 10; i++) {
          //  $(preisORtarifFilter).selectOption(getRandom(size));
            selectRandomFrom(preisORtarifFilter);
        }






      /*


        ElementsCollection list1 = $$(By.xpath("//div[@class='values']/span[1]"));

        $(sortierenFilter).selectOption(4);
        sleep(2000);
        ElementsCollection list2 = $$(By.xpath("//div[@class='values']/span[1]"));


        List<Double> pricelist = new LinkedList<>();


        for (SelenideElement e : $$(By.xpath("//div[@class='values']/span[1]"))) {
            double price = Double.parseDouble(
                    e.getText()
                            .split("Monat")[1]
                            .replaceAll("[^0-9,]+", "")
                            .replace(",", ".")

            );

            System.out.println(price);
        }
 */

    }

}
