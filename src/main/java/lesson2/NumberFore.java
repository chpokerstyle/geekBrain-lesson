package lesson2;

/**
 * 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
 * указанную строку, указанное количество раз;
 */
public class NumberFore {

    public void print(String print, int cycle){
        for(int a = 0; a < cycle; a++){
            System.out.println(print);
        }
    }
}
