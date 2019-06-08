import java.util.Scanner;

public class SearchDataStudens {
    public static void main(String[] args) {

        Student student1 = new Student("123", "Иван", "Иванов", "Иванович",
                "12.01.1996", "375297953195", "психология", "1", "326");
        Student student2 = new Student("321", "Сергей", "Сергеевич", "Сергеев", "12.01.1997", "375298299462", "юридический", "2", "333");
        Student student3 = new Student("219", "Михаил", "Петрович", "Новиков", "17.09.1995", "3752937698462", "психология", "4", "476");
        Student student4 = new Student("278", "Виктор", "Сергеевич", "Сидоров", "19.04.1995", "375297984845", "юридический", "4", "488");
        StudentList newList = new StudentList();
        newList.addStudent(student1);
        newList.addStudent(student2);
        newList.addStudent(student3);
        newList.addStudent(student4);

            System.out.println("Введите:\n  1-для поиска студента по факультету:\n  2-для поиска после заданного года рождения " +
                    "\n  3-для поиска по номеру группы:\n  4-для поиска по факультету и курсу");

            Scanner scanner = new Scanner(System.in);
            Scanner CaseScanner = new Scanner(System.in);
            String SearchData;
            int SwitchProgramm = scanner.nextInt();


            switch (SwitchProgramm) {
                case (1):

                    System.out.println("Введите название факультета");
                    SearchData = CaseScanner.nextLine();
                    newList.facultyPrint(SearchData);
                    break;
                case (2):
                    System.out.println("Введите год рождения");
                    SearchData = CaseScanner.nextLine();
                    newList.yearOfBirthPrint(SearchData);
                    break;
                case (3):
                    System.out.println("Введите номер группы");
                    SearchData = CaseScanner.nextLine();
                    newList.groupPrint(SearchData);
                    break;
                case(4):
                    System.out.println("Введите название факультета") ;
                    SearchData = CaseScanner.nextLine();
                    System.out.println("Введите  номер курса");
                    String Course=CaseScanner.nextLine();
                    newList.facultyCoursePrint(SearchData,Course);
                default:
                    System.out.println("Данные введены некорректно");


            }






    }
}
