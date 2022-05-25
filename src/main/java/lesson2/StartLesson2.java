package lesson2;

public class StartLesson2 {
    public static void main(String[] args) {
        NumberOne numberOne = new NumberOne();
        var bool = numberOne.equalsInt(10,9);
        System.out.println(bool);

        NumberTwo numberTwo = new NumberTwo();
        var print = numberTwo.equalsDouble(1);
        System.out.println(print);

        NumberTree numberTree = new NumberTree();
        var isTrueOrFalse = numberTree.trueOrFalse(-10);
        System.out.println(isTrueOrFalse);

        NumberFore numberFore = new NumberFore();
        numberFore.print("Я не хочу выполнять дз. Я хочу кушать ", 4);

        /**
         * Пятого задания нет...
         */
    }
}
