
import java.io.IOException;

import java.util.Scanner;

public class QuicksortStart {

    public static void main(String[] args) throws IOException {
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        int[] sourceNumbers = new int[size];
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = in.nextInt();
            System.out.print(sourceNumbers[i]);
        }
        System.out.println();
        System.out.print("После сортировки: ");

            Quicksort.qsort(sourceNumbers);

            for (int a = 0; a < size; a++){
                System.out.print(sourceNumbers[a]);
            }
        System.out.println();
                System.out.print("Число с наименьшей длиной: "+sourceNumbers[0]+" ");
        System.out.print("Число с наибольшей длиной: "+sourceNumbers[size-1]+" ");





        }






    }
