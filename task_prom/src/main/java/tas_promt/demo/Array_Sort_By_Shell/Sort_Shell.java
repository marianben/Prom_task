package tas_promt.demo.Array_Sort_By_Shell;

import jdk.nashorn.tools.Shell;

public class Sort_Shell {

    public static void main(String[] args) {

        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;


        for (int gap = length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < length; i++) {
                int key = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
        for (int i = 0; i <length ; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
