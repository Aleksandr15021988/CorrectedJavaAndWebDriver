import java.util.Scanner;



public class Greetings{
    public static void main (String[]args) {
        String nameOfOwner = "Саша";
        String name;
   do{
       System.out.print("Введите Ваше имя:");


      Scanner input = new Scanner(System.in);
       name = input.nextLine();
      System.out.println("Привет " + name);
  }while(!nameOfOwner.equals(name));
        System.out.println("Рад снова видеть тебя");


    }

}


