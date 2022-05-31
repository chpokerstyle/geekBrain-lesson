package lesson2;

/**
 * 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */

public class NumberTwo {
    public String equalsDouble(int a){
        String message;

        if(a<0)return message = " число отрицательное";
        else return message = "число положительное";
    }
}
