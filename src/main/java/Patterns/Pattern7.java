package Patterns;

/*
 *****
  ****
   ***
    **
     *
 */
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;

        for(int i =0; i<n; i++){
            System.out.print(" ".repeat(i));
            System.out.print("*".repeat(n-i));
            System.out.println();
        }
    }
}
