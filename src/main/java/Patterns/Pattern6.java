package Patterns;

/*

       *
      **
     ***
    ****
   *****
 */
public class Pattern6 {
    public static void main(String[] args) {
        int n =5;

       for(int i =0; i<n; i++){
           System.out.print(" ".repeat(n-i-1));
           System.out.print("*".repeat(i+1));
           System.out.println();
       }

    }
}
