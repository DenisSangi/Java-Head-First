package ru.praktikumServices.qaScooter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.open;

public class QuestionsPOMElements {

    public void openPage() {

        open("https://qa-scooter.praktikum-services.ru/");
    }

    //Локатор первого вопроса
    @FindBy(how = How.ID, using = "accordion__heading-0")
    SelenideElement firstQuestion;

    //Локатор первого ответа
    @FindBy(how = How.ID, using = "accordion__panel-0")
    SelenideElement firstAnswer;

    //Метод клика на первый вопрос
    public void firstQuestionClick () {

        firstQuestion.scrollIntoView(true);
        firstQuestion.shouldBe(Condition.visible);
        firstQuestion.click();
    }

    //Метод проверка первого ответа
    public void firstAnswerCheck () {

        firstAnswer.shouldBe(Condition.visible);
        firstAnswer.shouldHave(Condition.exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    //Локатор 2 вопроса
    @FindBy(how = How.ID, using = "accordion__heading-1")
    SelenideElement secondQuestion;

    //Локатор 2 ответа
    @FindBy(how = How.ID, using = "accordion__panel-1")
    SelenideElement secondAnswer;

    //Метод клика на 2 вопрос
    public void SecondQuestionClick () {

        secondQuestion.scrollIntoView(true);
        secondQuestion.shouldBe(Condition.visible);
        secondQuestion.click();
    }

    //Метод проверка 2 ответа
    public void secondAnswerCheck () {

        secondAnswer.shouldBe(Condition.visible);
        secondAnswer.shouldHave(Condition.exactText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    //Локатор 3 вопроса
    @FindBy(how = How.ID, using = "accordion__heading-2")
    SelenideElement thirdQuestion;

    //Локатор 3 ответа
    @FindBy(how = How.ID, using = "accordion__panel-2")
    SelenideElement thirdAnswer;

    //Метод клика на 3 вопрос
    public void thirdQuestionClick () {

        thirdQuestion.scrollIntoView(true);
        thirdQuestion.shouldBe(Condition.visible);
        thirdQuestion.click();
    }

    //Метод проверка 3 ответа
    public void thirdAnswerCheck () {

        thirdAnswer.shouldBe(Condition.visible);
        thirdAnswer.shouldHave(Condition.exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    //Локатор 4 вопроса
    @FindBy(how = How.ID, using = "accordion__heading-3")
    SelenideElement fourthQuestion;

    //Локатор 4 ответа
    @FindBy(how = How.ID, using = "accordion__panel-3")
    SelenideElement fourthAnswer;

    //Метод клика на 4 вопрос
    public void fourthQuestionClick () {

        fourthQuestion.scrollIntoView(true);
        fourthQuestion.shouldBe(Condition.visible);
        fourthQuestion.click();
    }

    //Метод проверка 4 ответа
    public void fourthAnswerCheck () {

        fourthAnswer.shouldBe(Condition.visible);
        fourthAnswer.shouldHave(Condition.exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    //Локатор 5 вопроса
    @FindBy(how = How.ID, using = "accordion__heading-4")
    SelenideElement fifthQuestion;

    //Локатор 5 ответа
    @FindBy(how = How.ID, using = "accordion__panel-4")
    SelenideElement fifthAnswer;

    //Метод клика на 5 вопрос
    public void fifthQuestionClick () {

        fifthQuestion.scrollIntoView(true);
        fifthQuestion.shouldBe(Condition.visible);
        fifthQuestion.click();
    }

    //Метод проверка 5 ответа
    public void fifthAnswerCheck () {

        fifthAnswer.shouldBe(Condition.visible);
        fifthAnswer.shouldHave(Condition.exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }

    //Локатор 6 вопроса
    @FindBy(how = How.ID, using = "accordion__heading-5")
    SelenideElement sixQuestion;

    //Локатор 6 ответа
    @FindBy(how = How.ID, using = "accordion__panel-5")
    SelenideElement sixAnswer;

    //Метод клика на 6 вопрос
    public void sixQuestionClick () {

        sixQuestion.scrollIntoView(true);
        sixQuestion.shouldBe(Condition.visible);
        sixQuestion.click();
    }

    //Метод проверка 6 ответа
    public void sixAnswerCheck () {

        sixAnswer.shouldBe(Condition.visible);
        sixAnswer.shouldHave(Condition.exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    //Локатор 7 вопроса
    @FindBy(how = How.ID, using = "accordion__heading-6")
    SelenideElement sevenQuestion;

    //Локатор 7 ответа
    @FindBy(how = How.ID, using = "accordion__panel-6")
    SelenideElement sevenAnswer;

    //Метод клика на 7 вопрос
    public void sevenQuestionClick () {

        sevenQuestion.scrollIntoView(true);
        sevenQuestion.shouldBe(Condition.visible);
        sevenQuestion.click();
    }

    //Метод проверка 7 ответа
    public void sevenAnswerCheck () {

        sevenAnswer.shouldBe(Condition.visible);
        sevenAnswer.shouldHave(Condition.exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }

    //Локатор 8 вопроса
    @FindBy(how = How.ID, using = "accordion__heading-7")
    SelenideElement eightQuestion;

    //Локатор 8 ответа
    @FindBy(how = How.ID, using = "accordion__panel-7")
    SelenideElement eightAnswer;

    //Метод клика на 8 вопрос
    public void eightQuestionClick () {

        eightQuestion.scrollIntoView(true);
        eightQuestion.shouldBe(Condition.visible);
        eightQuestion.click();
    }

    //Метод проверка 8 ответа
    public void eightAnswerCheck () {

        eightAnswer.shouldBe(Condition.visible);
        eightAnswer.shouldHave(Condition.exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }
}



