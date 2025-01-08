package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task15 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                array[i][j] = console.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = i + 1; j < 3; j++) {
                // Меняем элементы местами
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
