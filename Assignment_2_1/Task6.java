package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task6{
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();

        array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = console.nextInt();
        }
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        console.close();
    }

}
