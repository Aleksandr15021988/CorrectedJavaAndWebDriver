import java.util.Scanner;

public class ArrayMethods {


    static int[][] getRandomMatrix(int a) {
        if (a == 0) System.out.println("Программа завершена");
        int arr[][] = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = (int) ((Math.random() * a * 2) - a);
            }
        }
        return arr;
    }

    static int[][] getSortMatrix(int a[][], int c) {
        System.out.println("После сортировки:");
        int b[] = new int[c * c];
        int ctr = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[ctr++] = a[i][j];
            }
        }
        Quicksort.qsort(b);
        ctr = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = b[ctr++];
            }
        }
       return a;
    }

    static int[][] getRightShift(int a[][],int b) {
        System.out.println("Введите на сколько позиций сдвинуть вправо");
        Scanner in = new Scanner(System.in);
        int step = in.nextInt();
        if (step > b || step < 1) {
            System.out.println("Сдвиг невозможен");
        }
        int box;
        int j, i;
        for (int r = 0; r < step; r++) {
            for (i = 0; i < a.length; i++) {
                box = a[i][a.length - 1];
                for (j = a.length - 1; j > 0; j--) {
                    a[i][j] = a[i][j - 1];
                }
                a[i][j] = box;
            }
        }
        return a;
    }

}






