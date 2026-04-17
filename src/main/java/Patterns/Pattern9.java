package Patterns;

import javax.crypto.spec.PSource;

/*
 *********
  *******
   *****
    ***
     *
 */
public class Pattern9 {
    public static void main(String[] args) {
        int n =5;
        for(int i =0; i<n; i++){
            for(int j =0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k =0; k<((n*2) - (i*2)-1); k++){
                System.out.print("*");
            }

            System.out.println();
        }


    }


}
