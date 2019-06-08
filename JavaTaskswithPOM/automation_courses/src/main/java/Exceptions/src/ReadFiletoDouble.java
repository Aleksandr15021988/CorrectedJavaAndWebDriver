import java.io.*;
import java.util.NoSuchElementException;

public class ReadFiletoDouble {

    public static void main(String[] args) {
        double[] numbers = new double[5];
        String buffer;
        String devider[];
        double sum = 0;

        try (BufferedReader  br = new BufferedReader(new FileReader("c:\\CC.txt")))
        {
            buffer = br.readLine();

            devider = buffer.split(",");

            for (int i = 0; i < devider.length; i++) {
                try {
                    numbers[i] = Double.parseDouble(devider[i]);
                    sum += numbers[i];
                    if (numbers[i] < 0)
                        try {
                            throw new NegativeNumberException(numbers[i]);
                        } catch (NegativeNumberException myExc) {
                            myExc.printStackTrace();
                        }

                } catch (OutOfMemoryError ome) {
                    ome.printStackTrace();
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                } catch (NoSuchElementException exc){
                    exc.printStackTrace();
            }
                }


        } catch (FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);



    }
}




