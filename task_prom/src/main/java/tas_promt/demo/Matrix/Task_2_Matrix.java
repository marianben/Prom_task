package tas_promt.demo.Matrix;

public class Task_2_Matrix {

    public static void main(String[] args) {

        // String str   = "15+";
        //char cha = '*';
        // int dec = Integer.parseInt(oct, 8);
        //System.out.println("В десятичной с.с. будет " + dec);
        //System.out.println("Знак ASCII будет " + (char) dec);
        //System.out.println(Character.toString(cha));
        //System.out.println(str.substring(2));
        int[][] matrixB = {
                {1 , 2 , 3 , 4 , 5},
                {6 , 7 , 8 , 9 , 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        int kil = 5;
        String mas[][] = new String[kil][kil];
        for (int i = 0; i < kil; i++) {
            System.out.println("\t");
            for (int j = 0; j < kil; j++) {
                if (i == j || i == 5 - j - 1) {
                    mas[i][j] = " *";
                } else {
                    if(matrixB[i][j]>0&&matrixB[i][j]<10){
                        System.out.print(" ");
                        mas[i][j] = Integer.toString(matrixB[i][j]);
                    }else {
                        mas[i][j] = Integer.toString(matrixB[i][j]);
                    }
                    }
                System.out.print(mas[i][j] + " ");
            }
        }
            /*
             *  2  3  4  *
             6  *  8  * 10
             11 12  * 14 15
             16  * 18  * 20
              * 22 23 24  *
             */
    }
}