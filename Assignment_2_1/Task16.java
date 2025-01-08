package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task16 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        int width = 2 * height - 1;
        array = new char[height][width];
        for(int i = 0; i < height; i++) {
            int left = height - 1 - i;
            int right = height - 1 + i;
            for(int j = 0; j < width; j++) {
                if(j >= left && j <= right) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}