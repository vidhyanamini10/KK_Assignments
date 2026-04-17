package Patterns;

/*

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */
public class Pattern5 {
    public static void main(String[] args) {
        int n =5;
        for(int i=0; i<n; i++){
            System.out.println("*".repeat(i+1));
        }

        for(int i =n-1; i>=1; i--){
            System.out.println("*".repeat(i));
        }

    }
}
