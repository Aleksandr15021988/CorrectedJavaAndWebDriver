import java.util.List;

public class ActionsWithList {

    public void deleteEverySecond(List<Employee> list) {
        while (list.size() > 1) {
            for (int i = 0; i<list.size(); i++){
              if (i % 2 == 0){
                  list.remove(i);
             }
          }
        }
    }
}
