import gcdpackage.gcd;
import lcmPackage.lcm;
import java.util.Scanner;

public class _4a_gcdAndlcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        gcd gcd1 = new gcd(a, b);
        System.out.println("Gcd of " + a + ", " + b + " = " + gcd1.calcGcd(a, b));

        lcm lcm1 = new lcm(a, b);
        System.out.println("Lcm of " + a + ", " + b + " = " + lcm1.calcLcm(a, b));

        sc.close();
    }
}
