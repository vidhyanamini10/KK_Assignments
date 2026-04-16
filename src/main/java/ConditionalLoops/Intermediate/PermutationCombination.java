package ConditionalLoops.Intermediate;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number of items of set n value : ");
        int n = sc.nextInt();
        System.out.print("Enter r value : ");
        int r = sc.nextInt();
        int nMinusr = n-r;
        int per = factNumber(n)/ (factNumber(nMinusr));

        int comb = factNumber(n)/ factNumber(r) * (factNumber(nMinusr));

        System.out.println("permutation is " + per + " Combination is  " + comb );

        sc.close();
    }
    private static int factNumber(int n){
        int fact =1;
        for (int i =1; i<=n; i++){
            fact = fact *i;
        }
        return fact;
    }
}
