package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task13 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for(int i = 0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = console.nextInt();
            }
        }
        int max = array[0][0];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);

        console.close();
    }
}

