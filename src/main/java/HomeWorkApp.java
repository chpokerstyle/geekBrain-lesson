import tasks.fore.Compare;
import tasks.one.Fruit;
import tasks.one.PrintsImpl;
import tasks.three.Color;
import tasks.two.Check;

public class HomeWorkApp {


    public static void main(String[] args) {
        Fruit orange = new Fruit
                .FruitBuilder()
                .withName("Orange")
                .build();
        Fruit banana = new Fruit
                .FruitBuilder()
                .withName("Banana")
                .build();
        Fruit apple = new Fruit
                .FruitBuilder()
                .withName("Apple")
                .build();

        PrintsImpl prints = new PrintsImpl();
        prints.printThreeWords(orange);
        prints.printThreeWords(banana);
        prints.printThreeWords(apple);

        Check check = new Check();
        check.checkSumSign(1,0);

        Color color = new Color();
        color.printColor(1);

        Compare compare = new Compare();
        compare.compareNumbers(2,1);
    }
}
