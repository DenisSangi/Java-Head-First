package orderScooter;

import org.junit.BeforeClass;
import org.junit.Test;
import ru.praktikumServices.qaScooter.Page1POMElementsSelenide;
import ru.praktikumServices.qaScooter.Page2POMElementsSelenide;
import ru.praktikumServices.qaScooter.Page3POMElementsSelenide;

import static com.codeborne.selenide.Selenide.page;

public class OrderScooterTest {

    Page1POMElementsSelenide page1 = page(Page1POMElementsSelenide.class);
    Page2POMElementsSelenide page2 = page(Page2POMElementsSelenide.class);
    Page3POMElementsSelenide page3 = page(Page3POMElementsSelenide.class);

    @BeforeClass
    public static void setProperties() {

        //Configuration.browser = "safari";
    }

    @Test
    public void firstTestOfTopOrderButton () {

        page1.openPage();
        page1.clickOrderTopButton();
        page1.setFirstName("Денис");
        page1.setSecondName("Иванов");
        page1.setAddressInputField("Улица 46");
        page1.setMetroSelector("ВДНХ");
        page1.setPhoneInputField("88002000600");
        page1.clickNextButton();

        page2.setDate("23.02.2022");
        page2.setRentPeriod("пятеро суток");
        page2.setColor("серая безысходность");
        page2.setCommentInputField("Privet");
        page2.clickOrderButton();

        page3.orderConfirm();
        page3.clickYesButton();
        page3.orderContent();

    }

    @Test
    public void secondTestOfTopOrderButton () {

        page1.openPage();
        page1.clickOrderTopButton();
        page1.setFirstName("Второе");
        page1.setSecondName("Имя");
        page1.setAddressInputField("Адрес 15");
        page1.setMetroSelector("Сокольники");
        page1.setPhoneInputField("89123456789");
        page1.clickNextButton();

        page2.setDate("25.02.2022");
        page2.setRentPeriod("двое суток");
        page2.setColor("чёрный жемчуг");
        page2.setCommentInputField("");
        page2.clickOrderButton();

        page3.orderConfirm();
        page3.clickYesButton();
        page3.orderContent();

    }

    @Test
    public void firstTestOfBotOrderButton () {

        page1.openPage();
        page1.clickOrderBotButton();
        page1.setFirstName("Петр");
        page1.setSecondName("Семенов");
        page1.setAddressInputField("работа 007");
        page1.setMetroSelector("Сокол");
        page1.setPhoneInputField("12345678901");
        page1.clickNextButton();

        page2.setDate("27.02.2022");
        page2.setRentPeriod("сутки");
        page2.setColor("серая безысходность");
        page2.setCommentInputField("просто хай");
        page2.clickOrderButton();

        page3.orderConfirm();
        page3.clickYesButton();
        page3.orderContent();

    }

    @Test
    public void secondTestOfBotOrderButton () {

        page1.openPage();
        page1.clickOrderBotButton();
        page1.setFirstName("Вторая");
        page1.setSecondName("Проверка");
        page1.setAddressInputField("домашний 98");
        page1.setMetroSelector("Южная");
        page1.setPhoneInputField("10987654321");
        page1.clickNextButton();

        page2.setDate("26.02.2022");
        page2.setRentPeriod("двое суток");
        page2.setColor("чёрный жемчуг");
        page2.setCommentInputField("без комментариев");
        page2.clickOrderButton();

        page3.orderConfirm();
        page3.clickYesButton();
        page3.orderContent();

    }

}
