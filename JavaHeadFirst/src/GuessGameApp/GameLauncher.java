package GuessGameApp;

public class GameLauncher {                         // // Основной класс из которого запускается программма.
    public static void main(String[] args) {
        GuessGame game = new GuessGame();           // Создем объект класса GuessGame
        game.startGame();                           // Запускаем метод startGame (из класса GuessGame) для объекта game
    }
}
