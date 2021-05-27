package utils;

import org.openqa.selenium.By;

public class Locators {
    public static final String url = "https://telefonvertrag.de";
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







}
