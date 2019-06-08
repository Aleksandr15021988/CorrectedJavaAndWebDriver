import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        System.out.print("Введите число индекс матрицы: ");
        Scanner input = new Scanner(System.in);
        int sizeOfMatrix = input.nextInt();
       int  twoDimensionalMatrix[][];
       //int b[];

        twoDimensionalMatrix =  ArrayMethods.getRandomMatrix(sizeOfMatrix);
        for (int i = 0; i < twoDimensionalMatrix.length; i++) {
            for (int j = 0; j < twoDimensionalMatrix.length; j++) {
                System.out.print(twoDimensionalMatrix[i][j] + ", ");
            }
                System.out.println();
        }

         ArrayMethods.getSortMatrix(twoDimensionalMatrix,sizeOfMatrix);
        for (int i = 0; i < twoDimensionalMatrix.length; i++) {
            for (int j = 0; j < twoDimensionalMatrix.length; j++) {
                System.out.print(twoDimensionalMatrix[i][j] + ", ");
            }
            System.out.println();
        }


        ArrayMethods.getRightShift(twoDimensionalMatrix,sizeOfMatrix);
        for (int i = 0; i < twoDimensionalMatrix.length; i++) {
            for (int j = 0; j < twoDimensionalMatrix.length; j++) {
                System.out.print(twoDimensionalMatrix[i][j] + ", ");
            }
            System.out.println();
        }
    }
}