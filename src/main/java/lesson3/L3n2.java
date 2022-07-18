package lesson3;

import java.util.ArrayList;
import java.util.List;

public class L3n2 {

    public void createArr(){
        for (int i = 0; i <= 100; i++){
            List<Integer> arr = new ArrayList<>();
            arr.add(i);
            System.out.println(arr.stream().toList());
        }
    }
}
