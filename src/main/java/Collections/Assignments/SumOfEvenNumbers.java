package Collections.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Integer [] input = {4,5,0,9,8,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(input));
        int sum =0;
        for(Integer num : list){
            if(num % 2 ==0){
                sum += num;
            }
        }
        System.out.println("sum of even numbers: " + sum);

    }
}
