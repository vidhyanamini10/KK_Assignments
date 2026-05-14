package Collections.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighestRepeatedNumber {
    public static void main(String[] args) {
        Integer [] arr = {4,8,8,6,7,8,9,10,8,2,1,4,4,5,4,4};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        List<Integer> checked = new ArrayList<>();
        int maxCount = -1;
        int repeatedNum = -1;
        for(Integer num : list){
            if(!checked.contains(num)){
                int count = Collections.frequency(list,num);

                 //maxCount = Math.max(count,maxCount);
                if(count > maxCount){
                    maxCount = count;
                    repeatedNum = num;


                }
                checked.add(num);
            }
        }
        System.out.println(repeatedNum);

    }
}
