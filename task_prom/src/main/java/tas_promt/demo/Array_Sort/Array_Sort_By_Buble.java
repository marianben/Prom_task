package tas_promt.demo.Array_Sort;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Array_Sort_By_Buble {

    public static void main(String[] args) {

        int [] array = {30, 2, 10, 4, 6};
        int length = array.length;
        boolean isSort= false;
        int number;
        while(!isSort) {
            isSort = true;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i+1]) {
                    number = array[i];
                    array[i] = array[i+1];
                    array[i+1] = number;
                    isSort = false;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
