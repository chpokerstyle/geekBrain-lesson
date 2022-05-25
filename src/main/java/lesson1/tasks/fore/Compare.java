package lesson1.tasks.fore;

public class Compare {
    /**
     * 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их
     * любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
     * в противном случае “a < b”;
     */

    public void compareNumbers(int a, int b){
        if(a>=b){
            System.out.println("a >= b");
        }else {
            System.out.println("a<b ");
        }
    }
}
