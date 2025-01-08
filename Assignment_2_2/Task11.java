package Assignment_2.Assignment_2_2;

public class Task11 {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }
    public static void printSqrt(int[] array) {
        String first = "The square root for the number ";
        for(int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(first + element + " equals " + elementSqrt);
        }
    }
}
