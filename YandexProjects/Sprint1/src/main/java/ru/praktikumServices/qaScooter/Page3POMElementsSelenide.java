package ru.praktikumServices.qaScooter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page3POMElementsSelenide {

    //Локатор окна подтверждения
    @FindBy(how = How.CLASS_NAME, using = "Order_Modal__YZ-d3")
    private SelenideElement orderConfirmation;

    //Локатор кнопки Да
    @FindBy(how = How.XPATH,using = ".//button[text()='Да']")
    private SelenideElement yesButton;

    //Локатор окна подтверждения заказа
    @FindBy(how = How.CLASS_NAME, using = "Order_Text__2broi")
    SelenideElement orderContent;

    // Метод проверки отображения окна подтверждения заказа
    public void orderConfirm() {

        orderConfirmation.shouldBe(Condition.visible);
    }

    //Метод клика по кнопке Да
    public void clickYesButton() {

        yesButton.shouldBe(Condition.visible);
        yesButton.click();
    }

    public void orderContent() {

        orderContent.shouldBe(Condition.visible);

    }
}
