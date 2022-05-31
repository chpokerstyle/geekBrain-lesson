package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L3n6 {
    List<Integer> array = new ArrayList<>();

    public void minAndMax(){
        array.add(3);
        array.add(4);
        array.add(6);
        array.add(1);
        array.add(7);
        array.add(10);
        array.add(8);
        array.add(9);
        array.add(5);
        array.add(2);
        Collections.sort(array);

        var min = array.get(0);
        var max = array.get(array.size()-1);

        System.out.println(min + " < " + max);
            //Вот очень лень писать сортировки пузырьком или стримами...
    }
}
