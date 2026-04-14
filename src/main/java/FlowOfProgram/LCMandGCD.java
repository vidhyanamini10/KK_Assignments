package FlowOfProgram;

public class LCMandGCD {
    public static void main(String[] args) {
        System.out.println("LCM = " + LCMandGCD.lcm(48,18));
        System.out.println("GCD = " + LCMandGCD.gcd(48,18));
    }

    public static int lcm(int a,int b){
        // lcm = a%b * gcd(a,b);

        return a % b * gcd(a,b);
    }
    public static int gcd(int a,int b){

        // gcd (b, a%b)
        // Any number that divides both a and b must also divide a % b (the remainder)

        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
