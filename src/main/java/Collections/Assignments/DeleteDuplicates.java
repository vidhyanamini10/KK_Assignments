package Collections.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeleteDuplicates {
    public static void main(String[] args) {
        Integer [] arr = {1,3,4,4,5,3,6,6};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        List<Integer> newList = new ArrayList<>();// unique elements

        for(Integer num : list){
            if(!newList.contains(num)){
                int count = Collections.frequency(list,num);
                if(count ==1){
                    newList.add(num);
                }

            }
        }
        System.out.println(newList);
    }
}
