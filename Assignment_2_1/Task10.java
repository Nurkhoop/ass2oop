package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        multiArray = new int[N][];


        for (int i = 0; i < N; i++) {
            int size = console.nextInt();
            multiArray[i] = new int[size];
        }

        // Вывод массива на экран
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[]");
            }
            System.out.println(); // Переход на новую строку
        }
    }
}

