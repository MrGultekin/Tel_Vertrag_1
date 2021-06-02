package stepdefs;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static utils.Locators.cookieAcceptButton;

public class heute {


    @Test
    public void heute() {
        open("https://telefonvertrag.de/blog/");
        $(cookieAcceptButton).shouldBe(Condition.visible).click();


        $(".search-box input").shouldBe(Condition.visible).setValue("Tag");
        $(".search-box ul li",2).shouldBe(Condition.exist).scrollTo().click();
        sleep(10000);
    }

}
