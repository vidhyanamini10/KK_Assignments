package Collections.Assignments;

import java.util.ArrayList;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list1.add(4);
        list1.add(9);
        list1.add(8);
        list2.add(0);
        list2.add(5);
        list2.add(10);

        System.out.println(list1);
        System.out.println(list2);
        list.addAll(list1);
        list.addAll(list2);
        System.out.println(list);





    }
}
