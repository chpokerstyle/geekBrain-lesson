package lesson1.tasks.two;

public class Check {

    /**
     * 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
     * и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
     * в противном случае - “Сумма отрицательная”;
     */

    public void checkSumSign(int a, int b){


        int sum = a+b;
        if(sum >= 0){
            System.out.println("сумма положительна ");
        }else {
            System.out.println("Сумма отрицательна ");
        }
    }
}
