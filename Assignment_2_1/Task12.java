package Assignment_2.Assignment_2_1;

public class Task12 {
    public static int[][] array;
    public static void main(String[] args) {
        array = new int[2][3];
        for(int i = 0 ; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                array[i][j] = 2;
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

