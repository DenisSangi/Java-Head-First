package Glava1;



public class PhraseOMatic {

    public static void main(String [] args) {

        //1) Создаем три набора слов

        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый",
                "взаимный", "обоюдный выигрыш", "фронтэнд", "на основе веб-технологий",
                "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};

        String[] wordListTwo = {"уполномоченный", "трудный", "чистый проудкт", "ориентировннный", "центральный", "распределенный",
                "кластеризованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой",
                "сфокусированый", "использованный с выгодой", "выровненный", "нацеленный на", "общий",
                "совместный", "ускоренный"};

        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения",
                "тип структуры", "талант", "подход", "уровень звоеванного внимания",
                "портал", "период времени", "обзор", "образец", "пункт следования"};

        //2) Вычисляем сколько слов в каждом списке

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //3) Генерируем три случайных числа

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //4) Теперь строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //5) Выводим фразу на экран
        System.out.println("Все, что нам нужно, - это " + phrase);

    }
}