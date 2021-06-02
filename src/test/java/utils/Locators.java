package utils;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Locators {
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

// price box

    public static final By priceBox = By.cssSelector(".pricing");


}
