package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task7 {
    public static String[] strings = new String[6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        // Удаление повторяющихся строк
        for(int i = 0; i < strings.length; i++) {
            if(strings[i] != null) {
                for(int j = i + 1; j < strings.length; j++) {
                    if(strings[i] != null && strings[i].equals(strings[j])) {
                        strings[j] = null;
                        strings[i] = null;
                    }
                }
            }
        }

        // Вывод массива после удаления повторяющихся строк
        for(int i = 0; i < strings.length; i++)  {
            System.out.print(strings[i] + ", ");
        }
    }
}
