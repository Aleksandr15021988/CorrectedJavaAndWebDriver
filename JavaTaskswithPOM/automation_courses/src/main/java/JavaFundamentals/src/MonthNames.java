import java.util.Scanner;

public class MonthNames {


    public static void main(String[] args) {
        String[] month = {"январь", "феваль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int size;
        System.out.print("Введите цифры от одного до 12 ");
        Scanner in = new Scanner(System.in);
        try {
            size = in.nextInt();
            System.out.print(month[size - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого месяца не существует");
        }

    }

}




