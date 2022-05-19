package tasks.one;

import tasks.one.Fruit;

public class PrintsImpl {
    public PrintsImpl() {
    }

    /**
     *
     2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
     Orange
     Banana
     Apple
     */


    public void printThreeWords(Fruit fruit) {

        System.out.println(fruit.name);
    }
}
