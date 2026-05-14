package Collections.Assignments;

import java.util.ArrayList;
import java.util.List;

public class SplitList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(0);
        list.add(9);
        list.add(8);
        list.add(10);
        System.out.println("list is : "+ list);

// subList(start, end) — directly cuts the list from start to end index. One line per half!

        List<Integer> l1 = new ArrayList<>(list.subList(0,list.size()/2));
        List<Integer> l2 = new ArrayList<>(list.subList(list.size()/2, list.size()));
        /*for(int i =0; i < list.size()/2; i++){
            l1.add(list.get(i));

        }
        for(int i = l1.size(); i< list.size(); i++){
            l2.add(list.get(i));
        }*/
        System.out.println("l1 is : " + l1);
        System.out.println("l2 is : " + l2);





    }
}
