import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeCollection {
    public static void main(String[] args) {
        ReadDataOfEmployee readEmployee=new ReadDataOfEmployee();
        String nextEmployee[]=readEmployee.readNameOfEmployeeFromFile();
        ActionsWithList actionsWithList=new ActionsWithList();
        List<Employee> employeeArrayList = new ArrayList<>();
        List<Employee> employeeLinkedList = new LinkedList<>();
        for (int i = 0; i < nextEmployee.length; i++) {
            employeeArrayList.add(new Employee(nextEmployee[i]));
            employeeLinkedList.add(new Employee(nextEmployee[i]));
            System.out.println(nextEmployee[i]);
        }
        actionsWithList.deleteEverySecond(employeeLinkedList);
        actionsWithList.deleteEverySecond(employeeArrayList);
        System.out.println(employeeLinkedList);


    }


}
