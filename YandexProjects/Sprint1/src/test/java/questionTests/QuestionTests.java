package questionTests;

import org.junit.BeforeClass;
import org.junit.Test;
import ru.praktikumServices.qaScooter.QuestionsPOMElements;

import static com.codeborne.selenide.Selenide.page;

public class QuestionTests {

    QuestionsPOMElements firstQuestion = page(QuestionsPOMElements.class);
    QuestionsPOMElements secondQuestion = page(QuestionsPOMElements.class);
    QuestionsPOMElements thirdQuestion = page(QuestionsPOMElements.class);
    QuestionsPOMElements fourthQuestion = page(QuestionsPOMElements.class);
    QuestionsPOMElements fifthQuestion = page(QuestionsPOMElements.class);
    QuestionsPOMElements sixQuestion = page(QuestionsPOMElements.class);
    QuestionsPOMElements sevenQuestion = page(QuestionsPOMElements.class);
    QuestionsPOMElements eightQuestion = page(QuestionsPOMElements.class);

    @BeforeClass
    public static void setProperties() {

        //Configuration.browser = "safari";
    }

    @Test
    public void questionOneTest() {

        firstQuestion.openPage();
        firstQuestion.firstQuestionClick();
        firstQuestion.firstAnswerCheck();
    }

    @Test
    public void secondQuestionTest() {

        secondQuestion.openPage();
        secondQuestion.SecondQuestionClick();
        secondQuestion.secondAnswerCheck();
    }

    @Test
    public void thirdQuestionTest() {

        thirdQuestion.openPage();
        thirdQuestion.thirdQuestionClick();
        thirdQuestion.thirdAnswerCheck();
    }

    @Test
    public void fourthQuestionTest() {

        fourthQuestion.openPage();
        fourthQuestion.fourthQuestionClick();
        fourthQuestion.fourthAnswerCheck();
    }

    @Test
    public void fifthQuestionTest() {

        fifthQuestion.openPage();
        fifthQuestion.fifthQuestionClick();
        fifthQuestion.fifthAnswerCheck();
    }

    @Test
    public void sixQuestionTest() {

        sixQuestion.openPage();
        sixQuestion.sixQuestionClick();
        sixQuestion.sixAnswerCheck();
    }

    @Test
    public void sevenQuestionTest() {

        sevenQuestion.openPage();
        sevenQuestion.sevenQuestionClick();
        sevenQuestion.sevenAnswerCheck();
    }

    @Test
    public void eightQuestionTest() {

        eightQuestion.openPage();
        eightQuestion.eightQuestionClick();
        eightQuestion.eightAnswerCheck();
    }

}
