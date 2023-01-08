/* Question:-
write a java pgm to design a simple calc using switch statement. handle arithmetic excpetions wherever necessary
 */

import java.util.Scanner;


public class Lab_6b {

    public static void calculator(int a, int b, char op) {
        switch(op) {
            case '+':
                int c = (int)a + b;
                System.out.println("a + b = " + c);
                break;
            case '-':
                int s = (int)a - b;
                System.out.println("a + b = " + s);
                break;
            case '*':
                int m = (int)a * b;
                System.out.println("a * b = " + m);
                break;
            case '/':
                try {
                    int d = a / b;
                    System.out.println("a / b = " + d);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Please enter the correct option");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        
        System.out.println("\n+ : Addition");
        System.out.println("- : Substraction");
        System.out.println("* : Multiplication");
        System.out.println("/ : Division");
        System.out.println("q : Quit");
        System.out.print("\nEnter operation: ");
        char ch = sc.next().charAt(0);
        while(ch != 'q') {
            calculator(a, b, ch);
            System.out.print("\nEnter operation: ");
            ch = sc.next().charAt(0);
        }
        sc.close();
    }
}