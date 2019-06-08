import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputIntegers {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите целые числа через пробел: ");
        int sum = 0;
        int number;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String reader =br.readLine();
        String[]separator = reader.split(" ");
        for(int i=0;i<separator.length;i++){
             number = Integer.parseInt(separator[i]);
             sum +=number;
        }
        System.out.println(sum);

    }
}