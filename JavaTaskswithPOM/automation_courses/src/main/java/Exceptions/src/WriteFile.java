import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args)  {
        String[]str={"7","2","3","4","5"};

       try (FileWriter fw = new FileWriter("c:\\CC.txt"))
       {
           for (int i = 0; i < str.length; i++)
             while (str[i]!=null) fw.write(str[i] + ",");
       }catch (IOException e){


       }
    }
}
