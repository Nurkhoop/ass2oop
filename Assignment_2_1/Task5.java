package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 0) {
            int[] num = new int[N];
            for (int i = 0; i < N; i++) {
                num[i] = scanner.nextInt();
            }
            if (N % 2 == 0) {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println(num[i]);
                }
            } else {
                for (int i = 0; i < N; i++) {
                    System.out.println(num[i]);
                }
            }
        }
        scanner.close();
    }
}
