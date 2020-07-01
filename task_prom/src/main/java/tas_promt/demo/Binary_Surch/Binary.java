package tas_promt.demo.Binary_Surch;

import java.util.Arrays;

public class Binary {

    public static void main(String[] args) {

        int data[] = {5, 5, 19, 25, 43, 54, 63, 76, 84, 91, 93};
        int numberToFind = data[0];
        Arrays.sort(data);
       // System.out.println(Arrays.toString(data));
        int i = 0;
        int j = data.length-1;
        int m = j/2;
        int value;
        while((value=data[m])!=numberToFind && i < j){
            if(numberToFind > data[m]){
                i = m+1;
                m =(i+j)/2;
            } else {
                j = m-1;
                m =(i+j)/2;
            }
        }
        if(data[m]==numberToFind){
            System.out.println(m);
        } else{
            System.out.println(-1);
        }
    }
}
