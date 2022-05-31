package lesson2;

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
 * если да – вернуть true, в противном случае – false.
 */
public class NumberOne {
    public boolean equalsInt(int a, int b) {
        int sum = a + b;
        if (sum < 10 || sum > 20) return false;
        return true;
    }
}
