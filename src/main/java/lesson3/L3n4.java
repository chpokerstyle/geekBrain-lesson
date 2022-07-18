package lesson3;

import java.util.Arrays;

public class L3n4 {
    public void doubleArray(){
        int size = 5;
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
            }
        }
    }
}
