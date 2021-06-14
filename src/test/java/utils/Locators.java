package utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public interface Locators {
    public static final String url = "https://telefonvertrag.de";
   // String email = "testuser@tutusmedia.com";


    public static final By contactFooterLink = By.xpath("//footer//a[text()='Kontakt & Support']");

    public static final By cookieAcceptButton = By.xpath("//button[@aria-label='Akzeptiere alle']");
    //Contact Form locators
    public static final By nameContactFormInput = By.xpath("//label[text()='Name']//following-sibling::input");
    public static final By emailContactFormInput = By.xpath("//label[text()='E-Mail Adresse']//following-sibling::input");
    public static final By subjectContactFormInput = By.xpath("//label[text()='Betreff']//following-sibling::input");
    public static final By newsContactFormTextarea = By.xpath("//label[text()='Deine Nachricht an uns']//following-sibling::textarea");
    public static final By acceptContactFormCheckbox = By.cssSelector(".custom-checkbox.custom-control");
    public static final By submitContactForm = By.cssSelector("button[type='button']");

    public static final By errorNotifications = By.cssSelector(".srv-validation-message");
    public static final By alertSuccess = By.cssSelector("div[role='alert']");

    // Newsletter input
    public static final By newsletterEmailRegistrationInput = By.xpath("//input[@type='email']");
    public static final By newsletterEmailRegistrationButton = By.cssSelector("button[class$='button']");
    public static final By newsletterEmailUnRegistrationLink = By.xpath("//a[@title='Newsletter wieder abmelden']");
    public static final By newsletterEmailUnRegistrationInput = By.cssSelector("input[placeholder='Deine E-Mail Adresse']");
    public static final By jetzAnmeldenMailButton = By.cssSelector(".newsletter-send-button");


    //Kabel product container 8 pieces
    public static final By kabelProductPrices = By.cssSelector(".plan_box_price_once_btn");
    public static final By goTocartButton = By.cssSelector(".once_btn");
    public static final By extraTalkCheckBoxes = By.cssSelector("div[class$='custom-control']");// 3 pieces
    public static final By jetztBestellenBtn = By.xpath("//a[@class='checkout-btn']");
    public static final By cableLinkMenu = By.xpath("//ul//a[@title='Kabel']");

    //Personal Infos Locators
    public static final By genderSelect = By.xpath("//label[text()='Anrede']/following-sibling::select");
    public static final By titleSelect = By.xpath("//label[text()='Titel']/following-sibling::select");
    public static final By nameInput = By.xpath("//label[text()='Vorname']/following-sibling::input");
    public static final By surnameInput = By.xpath("//label[text()='Nachname']/following-sibling::input");
    public static final By telephonInput = By.xpath("//label[text()='Telefon ']//following-sibling::input");
    public static final By emailInput = By.xpath("//label[text()='E-Mail ']//following-sibling::input");
    public static final By postCodeInput = By.xpath("//label[text()='PLZ']//following-sibling::input");
    public static final By cityInput = By.xpath("//label[text()='Wohnort']//following-sibling::input");
    public static final By streetInput = By.xpath("//label[text()='Strasse']//following-sibling::input");
    public static final By houseNumberInput = By.xpath("//label[text()='Hausnummer']//following-sibling::input");
    public static final By idTypeSelect = By.xpath("//label[text()='Ausweisart']//following-sibling::select");
    public static final By idPlaceOfIssueInput = By.xpath("//label[text()='Ausstellungsort']//following-sibling::input");
    public static final By dateOfBirthInput = By.xpath("//label[text()='Geburtsdatum ']//following-sibling::input");
    public static final By birthOfPlaceInput = By.xpath("//label[text()='Geburtsort']//following-sibling::input");
    public static final By expiryDateInput = By.xpath("//label[text()='Gültigkeit ']//following-sibling::input");
    public static final By idNumberInput = By.xpath("(//label[text()='Ausweisnummer']/following::input)[1]");
    public static final By accountOwnerInput = By.xpath("//label[text()='Kontoinhaber']//following-sibling::input");
    public static final By bankNameInput = By.xpath("//label[text()='Bank Name']//following-sibling::input");
    public static final By ibanInput = By.xpath("//label[text()='IBAN']//following-sibling::input");
    public static final By bicNumberInput = By.xpath("//label[text()='BIC']//following-sibling::input");
    //public static final By shippingRadioInput = By.xpath("//label[@for='versandart_1']/preceding-sibling::input");
    public static final By shippingRadioInput = By.xpath("//label[@for='versandart_1']");
    public static final By jetztBestellenWeiterBtn = By.xpath("//a[@class='checkout-btn']");



    //KemalD

    // price box

    public static final By priceBox = By.cssSelector(".pricing");


    //KemalD locaters
    // url
    String urlTV = "https://telefonvertrag.de/";





    // Header and Footer Selectors
    By acceptCookies = By.xpath("//button[@aria-label='Akzeptiere alle']");
    By dontAcceptCookies = By.xpath("(//span[@class='cf1y60'])[2]");
    By kontaktSupport = By.xpath("//a[@title='Kontakt & Support']");
    By fragenAntworten = By.xpath("//a[@title='Fragen & Antworten']");
    By versandZahlung = By.xpath("//a[@title='Versand & Zahlung']");
    By bestellStatus = By.xpath("//a[@title='Bestellstatus']");
    By handyVersicherung = By.xpath("//a[@title='Handyversicherung']");
    By reparaturService = By.xpath("//a[@title='Reparatur & Service']");
    By newsletter = By.xpath("//a[@title='Newsletter']");
    By speedtest = By.xpath("//a[@title='Speedtest']");
    By blog_Service = By.xpath("(//a[@title='Blog'])[4]");
    By blog_socialMSection = By.xpath("(//a[@title='Blog'])[3]");
    By aGB = By.xpath("//a[@title='AGB']");
    By impressum = By.xpath("//a[@title='Impressum']");
    By datenschutz = By.xpath("//a[@title='Datenschutzt']");
    By widerrufFormular = By.xpath("//a[@title='Widerrufsbelehrung & Formular']");
    By cookieRichtlinien = By.xpath("//a[@title='Cookie Richtlinienseite']");
    By handyMitVertrag = By.xpath("//a[@title='Handy mit Vertrag']");
    By shoppingChart = By.xpath("//a[@title='Checkout']");
    By kabel_main = By.xpath("(//a[@title='Kabel'])[2]");
    By kabel_mainMobile = By.xpath("(//a[@title='Kabel'])[1]");
    By dsl_main = By.xpath("(//a[@title='DSL'])[2]");
    By dsl_mainMobile = By.xpath("(//a[@title='DSL'])[1]");
    By gigaTv_main = By.xpath("(//a[@title='GigaTV'])[2]");
    By gigaTv_mainMobile = By.xpath("(//a[@title='GigaTV'])[1]");
    By blog_main = By.xpath("(//a[@title='Blog'])[2]");
    By blog_mainMobile = By.xpath("(//a[@title='Blog'])[1]");
    By readMoreLess = By.xpath("//a[@class='more']");
    By firstFilter = By.xpath("(//select[@class='form-control'])[1]");
    By preisORtarifFilter = By.xpath("(//select[@class='form-control'])[2]");
    By sortierenFilter = By.xpath("(//select[@class='form-control'])[3]");

    By download_In1 = By.xpath("(//div[@class='elips']/h4)[1]");
    By download_In2 = By.cssSelector("tr:nth-child(2) > td:nth-child(2) > div");
    By upload_In1 = By.xpath("(//div[@class='elips']/h4)[2]");
    By upload_In2 = By.cssSelector("tr:nth-child(1) > td:nth-child(2) > div");

    By tarifNameTop_IN=By.xpath("//div[@class='breadcrumbs']/h1");
    By tarifNameMiddle_IN=By.xpath("(//div[@class='title'])[1]");
    By tarifNameBottom_IN=By.xpath("//h2[@class='in-page-hone-alle-zum-tarif']");


    By ppriceRealTop=By.xpath("(//div[@class='price']/text())[1]");
    //  By ppriceRealBottom= (By) $$(By.cssSelector("tr:nth-child(1) > td:nth-child(2)")).get(1);
    By ppriceFirst6Top=By.xpath("(//div[@class='price']/text())[2]");
    By ppriceFirst6Bottom=By.cssSelector(" tr:nth-child(3) > td:nth-child(2)");

    By pAnschlussPreis_In1=By.cssSelector(" tr:nth-child(5) > td:nth-child(2)");
    By pAnschlussPreis_In2=By.xpath("//ul[@class='small-details']/li[2]/text()[2]");






    ElementsCollection productName_out = $$(By.xpath("//div[@class='plan_box tarife-name']"));
    ElementsCollection productDownload_out = $$(By.xpath("//div[@class='dsl-tarif-info']/div[1]"));
    ElementsCollection productUpload_out = $$(By.xpath("//div[@class='dsl-tarif-info']/div[2]"));
    ElementsCollection productPrice_out = $$(By.xpath("//a[@class='plan_box_price_once_btn']/div"));
    ElementsCollection abDem7Monate = $$(By.xpath("//div[@class='values']/span[1]"));
    ElementsCollection anschlussPreis = $$(By.xpath("//div[@class='values']/span[2]"));
    ElementsCollection prdctsLinks = $$(By.xpath("//a[@class='plan_box_price_once_btn']"));
    ElementsCollection tabs = $$(By.xpath("//div[@class='product-margin col-md-6 col-lg-4']"));
    // ElementsCollection bottomTable = $$(By.cssSelector("tr:nth-child(1) > td:nth-child(2)")).get(1);



    //Mobile menu ToggleBar
    By toggleMobileMenu = By.cssSelector(".fa-bars");






}
