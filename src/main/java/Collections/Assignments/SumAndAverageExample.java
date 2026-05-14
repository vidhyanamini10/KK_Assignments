package Collections.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumAndAverageExample {
    public static void main(String[] args) {
        Integer[] input = {4,5,0,9,8,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(input));
        int sum =0;
        for (Integer integer : list) {
            sum += integer;
        }

        int count = list.size();
        int avg = sum/count;

        System.out.println("sum is : " + sum);

        System.out.println("Average is : " + avg);


    }
}
