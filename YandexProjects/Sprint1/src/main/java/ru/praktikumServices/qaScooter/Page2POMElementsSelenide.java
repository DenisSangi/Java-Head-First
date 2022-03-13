package ru.praktikumServices.qaScooter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.byText;

public class Page2POMElementsSelenide {

    //Локатор поля Даты доставки
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement dateWidget;

    //Локатор срока аренды
    @FindBy(how = How.CLASS_NAME,using = "Dropdown-control")
    private SelenideElement rentPeriod;

    //Локатор выпадающего списка аренды
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-menu")
    private SelenideElement rentList;

    //Локатор чекбоксов выбора цвета
    @FindBy(how = How.CLASS_NAME, using = "Order_Checkboxes__3lWSI")
    private SelenideElement colorSelector;

    //Локатор для поля Комментарий
    @FindBy (how = How.XPATH,using = ".//input[@placeholder='Комментарий для курьера']")
    private SelenideElement commentInputField;

    //Локатор кнопки Назад
    @FindBy(how = How.XPATH,using = ".//button[text()='Назад']")
    private SelenideElement backButton;

    //Локатор кнопки Заказать
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/div[2]/div[3]/button[2]")
    private SelenideElement orderButton;

    //Метод для выбора даты доставки
    public void setDate(String date) {

        dateWidget.shouldBe(Condition.visible);
        dateWidget.setValue(date).pressEnter();
    }

    //Метод для выбора срока аренды
    public void setRentPeriod(String period) {

        rentPeriod.shouldBe(Condition.visible);
        rentPeriod.click();
        rentList.shouldBe(Condition.visible);
        rentList.find(byText(period)).click();

    }

    //Метод для выбора цвета
    public void setColor(String color) {

        colorSelector.shouldBe(Condition.visible);
        colorSelector.find(byText(color)).click();

    }

    //Метод заполнения поля ввода Комментарий
    public void setCommentInputField(String comment) {

        commentInputField.setValue(comment);

    }

    //Метод клика по кнопке Назад
    public void clickBackButton() {

        backButton.click();
    }

    //Метод клика по кнопке Заказать
    public void clickOrderButton() {

        orderButton.click();
    }


}
