package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n =5;
        for (int i =0; i<n ; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                for (int j = k - 1; j < k; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
