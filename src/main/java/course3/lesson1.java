package course3;

import java.util.Arrays;
import java.util.List;

public class lesson1 {
    public static void main(String[] args) {

        String[] arr = {"asd", "ds", "ret", "123"};
        //Integer[] arr = {3, 4, 6, 234, -1324, 111};

        System.out.println("Task 1\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));


        //Задача 2. Написать метод, который преобразует массив в ArrayList
        List<String> list = convertToList(arr);
        System.out.println("Task 2\n" + list.getClass() + " : " + list);

    }
    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}
