package Collections.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RepeatedElementsCount {
    public static void main(String[] args) {
        String[] arr = {"baby", "ball","soap", "shampoo", "chalk", "soap", "makeup","baby","lotion"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        List<String> checked = new ArrayList<>();

        for(String word : list){
            if(!checked.contains(word)){
                int count = Collections.frequency(list,word);
                if(count >1){
                    System.out.println("count : " + count + " word is : " + word );
                }
                checked.add(word);
            }
        }
    }
}
