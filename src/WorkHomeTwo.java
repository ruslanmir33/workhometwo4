import java.util.Arrays;

// Задание номер 1.
public class WorkHomeTwo {
    public static void main(String[] args) {
        int[] mass1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] == 0) mass1[i] = 0;
            else mass1[i] = 1;
        }
        System.out.println(Arrays.toString(mass1));

//  Задние номер 2.
        int[] mass2 = new int[8];
        for (int i = 0; i <= 7; i++) {
            mass2[i] = i * 3;
        }
        System.out.println(Arrays.toString(mass2));

//  Задание номер 3.
        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] < 6) {
                mass3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(mass3));

//  Задание номер 4.
        final int y = 7;
        int[][] mass4 = new int[y][y];
        printArr(mass4);
        for (int i = 0; i < y; i++) {
            mass4[i][i] = 1;
            mass4[i][y - 1] = 1;

        }
        printArr(mass4);
    }

    public static void printArr(int[][] masiv) {
        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv[i].length; j++) {
                System.out.println(masiv[i][j] + " ");

            }

            System.out.println();
        }
//  Задание номер 5.
        final int n = 11;
        int[] mass5 = new int[n];
        for (int i = 0; i < mass5.length; i++) {
            mass5[i] = (int) (Math.random() * 200);

        }
        System.out.print(Arrays.toString(mass5));
        int max, min;
        max = mass5[0];
        min = mass5[0];
        for (int i = 0; i < mass5.length; i++) {
            if (mass5[i] > max) {
                max = mass5[i];
            }
            if (mass5[i] < min) {
                min = mass5[i];
            }
        }
        System.out.printf("max - %d, min - %d", max, min);

    }
}