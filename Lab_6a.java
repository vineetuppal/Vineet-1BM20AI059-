import java.util.Scanner;

public class Lab_6a {

    public static void divMethod(int a, int b) {
        try {
            int c = a / b;
            System.out.println("a / b = " + c);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e);
        } finally {
            System.out.println("\nProgram terminated\n");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        divMethod(a, b);
        sc.close();
    }
}