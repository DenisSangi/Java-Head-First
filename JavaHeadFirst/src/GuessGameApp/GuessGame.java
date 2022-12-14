package GuessGameApp;

public class GuessGame {    // Класс описывающий работу игры

    Player p1;      //GuessGame содержит три переменных экземпляра для трех объектов Player.
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();          // Создаем три объекта Player и присваеваем их трем переменным экземпляра.
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;            // Объявляем три переменные для хранения вариантов от каждого игрока.
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;  // Объявляем три переменные для хранения правильности
        boolean p2isRight = false;  // или неправильности (true или false) ответов игроков.
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);              // создаем число, которое игроки должны угадать.
        System.out.println("Я загадываю число от 0 до 9 ...");

        while (true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);


            p1.guess();     //Вызываем метод guess() из каждого объекта Player.
            p2.guess();
            p3.guess();

            guessp1 = p1.number;                                                // Извлекаем варианты каждого игрока
            System.out.println("Первый игрок думает, что это " + guessp1);      // (результаты работы их методов guess()),

            guessp2 = p2.number;                                                // получая доступ к их переменным number.
            System.out.println("Второй игрок думает, что это " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);

            if (guessp1 == targetNumber) {          // Проверяем варианты каждого из игроков на соответствие заданному числу.
                p1isRight = true;                   // Если игрок угадал, то присваеваем соответствующей переменной знчение true.
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {          // Если первыйи, ИЛИ второй игрок, ИЛИ третий игрок
                                                                // угадал...
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + p1isRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("Третий игрок угадал?" + p3isRight);
                System.out.println("Конец игры");                           // Игра окончена.
                break;
            } else {
                // мы должны продолжать тк никто не угадал
                System.out.println("Игроки должны попробовать еще раз.");   // Иначе остаемся в цикле и просим игроков сделать ещеодну попытку.
            } // конец if/else
        }     // конец цикла
    }         // конец метода
}             // конец класса
