package ru.praktikumServices.qaScooter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;

public class Page1POMElementsSelenide {

    //Метод открытия сраницы
    public void openPage() {

        open("https://qa-scooter.praktikum-services.ru/");
    }

    //Локатор для кнопки Заказать 1
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement orderButtonTop;

    //Локатор кнопки Заказать 2
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button")
    private SelenideElement orderButtonBot;

    //Локатор поля ввода имени
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Имя']")
    private SelenideElement firstNameInputField;

    //Локатор поля ввода фамилии
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Фамилия']")
    private SelenideElement secondNameInputField;

    //Локатор поля ввода адреса
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement addressInputField;

    //Локатор поля ввода станции метро
    @FindBy(how = How.CLASS_NAME,using = "select-search__input")
    private SelenideElement metroSelector;

    //Локатор выпадающего списка станций метро
    @FindBy(how = How.CLASS_NAME,using = "select-search__select")
    private SelenideElement metroList;

    //Локатор для поля ввода номера телефона
    @FindBy (how = How.XPATH,using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement phoneInputField;

    //Локатор для кнопки Далее
    @FindBy(how = How.XPATH,using = ".//button[text()='Далее']")
    private SelenideElement nextButton;

    //Метод клика по кнопке Заказ 1
    public void clickOrderTopButton() {

        orderButtonTop.click();
    }

    //Метод клика по кнопке Заказ 2
    public void clickOrderBotButton() {

        orderButtonBot.scrollIntoView(true);
        orderButtonBot.shouldBe(Condition.visible);
        orderButtonBot.click();
    }


    //Метод заполнения поля ввода Имя
    public void setFirstName(String firstName) {

        firstNameInputField.setValue(firstName);

    }

    //Метод заполнения поля ввода Фамилия
    public void setSecondName(String secondName) {

        secondNameInputField.setValue(secondName);

    }

    //Метод заполнения поля ввода Адрес
    public void setAddressInputField(String address) {

        addressInputField.setValue(address);

    }

    //Метод для выбора станции метро

    public void setMetroSelector(String station) {

        metroSelector.click();

        metroList.shouldBe(Condition.visible);
        metroList.find(byText (station)).scrollIntoView(true);
        metroList.find(byText (station)).click();

    }

    //Метод заполнения поля ввода номера телефона
    public void setPhoneInputField(String phone) {

        phoneInputField.setValue(phone);

    }

    //Метод клика по кнопке Далее
    public void clickNextButton() {

        nextButton.click();
    }

}






