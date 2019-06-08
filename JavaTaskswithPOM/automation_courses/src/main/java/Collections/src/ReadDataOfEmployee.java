import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataOfEmployee {
    String nameBuffer;
    String[] name;

    String[] readNameOfEmployeeFromFile() {


        try (BufferedReader br = new BufferedReader(new FileReader("c://Employee.txt"))) {
            nameBuffer = br.readLine();
            name = nameBuffer.split(",");

        } catch (IOException e) {
            e.printStackTrace();
        }


        return name;

    }
}