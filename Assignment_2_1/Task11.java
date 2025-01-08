package Assignment_2.Assignment_2_1;

public class Task11 {
    public static int[][][][] multiArray = new int[][][][]{{{{4, 8, 15}, {16}}, {{23, 42}, {}},
        {{1}, {2}, {3}, {4, 5}}}};
    public static void main(String[] args) {
        for (int[][][] threeD : multiArray) {
            for (int[][] twoD : threeD) {
                for (int[] oneD : twoD) {
                    for (int num : oneD) {
                        System.out.println(num);
                    }
                }
            }
        }
    }
}


