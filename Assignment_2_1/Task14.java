package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task14 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = console.nextInt();
            }
        }
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++) {
            int rowSum = 0;
            for(int j = 0; j < 3; j++) {
                rowSum += array[i][j];
            }
            if(rowSum < minSum) {
                minSum = rowSum;
            }
        }


        for(int j = 0; j < 3; j++) {
            int colSum = 0;
            for(int i = 0; i < 3; i++) {
                colSum += array[i][j];
            }
            if(colSum < minSum) {
                minSum = colSum;
            }
        }

        System.out.println(minSum);

        console.close();
    }
}
