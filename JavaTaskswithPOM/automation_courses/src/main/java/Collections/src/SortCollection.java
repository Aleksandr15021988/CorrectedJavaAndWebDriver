import java.util.ArrayList;

import java.util.List;


public class SortCollection {
    public static void main(String[] args) {
        int[]values={25,15,71,12,9,4,7,2,56,23};
        int compare=10;

List<Integer> list=new ArrayList<>();
for(int i=0;i<values.length;i++){
    list.add(values[i]);
}

        int len = list.size();
        int i = 0;
        int replace = 0;
        while ( i < len - replace) {
            if (list.get(i) >compare) {
                list.add(len -1, list.remove(i));
               replace++;
            } else {
                i++;
            }
        }
        System.out.println(list);
    }


    }

