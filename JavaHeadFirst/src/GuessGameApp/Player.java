package GuessGameApp;

public class Player {       // Класс описывающий игроков
    int number = 0;         //  Здесь хранится вариант числа
    public void guess() {
        number = (int) (Math.random()*10);
        System.out.println("Думаю это число " + number);
    }
}
