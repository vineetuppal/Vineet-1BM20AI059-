package Java_Programs_Assignment;

class Number {
    private double n;

    Number(double n) {
        this.n = n;
    }

    double getNumber() {
        return this.n;
    }

    boolean isZero() {
        return n == 0;
    }

    boolean isPositive() {
        return n > 0;
    }

    boolean isNegative() {
        return n < 0;
    }

    boolean isOdd() {
        return (n % 2) == 1;
    }

    boolean isEven() {
        return (n % 2) == 0;
    }

    boolean isPrime() {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    int noOfDigits(int m) {
        int numOfDigs = 0;
        while (m > 0) {
            numOfDigs++;
            m /= 10;
        }
        return numOfDigs;
    }

    boolean isArmstrong() {
        double p = 0;
        int m = (int) n;
        int numOfDigs = noOfDigits(m);
        while (m > 0) {
            double rem = m % 10;
            p += Math.pow(rem, numOfDigs);
            m /= 10;
        }
        return n == p;
    }

    double getFactorial() {
        double res = 1;
        for (int i = 1; i <= (int) n; i++) {
            res *= i;
        }
        return res;
    }

    double getSqrt() {
        return Math.sqrt(n);
    }

    double getSqr() {
        return n * n;
    }

    double sumOfDigits() {
        int m = (int) n;
        double sum = 0;
        while (m > 0) {
            int rem = m % 10;
            sum += rem;
            m /= 10;
        }
        return sum;
    }

    double getReverse() {
        int m = (int) n;
        double rev = 0;
        int numOfDigs = noOfDigits(m);
        while (m > 0) {
            int rem = m % 10;
            numOfDigs--;
            rev += rem * Math.pow(10, numOfDigs);
            m /= 10;
        }
        return rev;
    }

    void dispBinary() {
        int m = (int) n;
        int bin = 0;
        int mul = 1;
        while (m > 0) {
            int bit = m % 2;
            bin += bit * (mul);
            m /= 2;
            mul *= 10;
        }
        System.out.println("Binary of " + n + " = " + bin);
    }

    void listFactors() {
        int m = (int) n;
        int increamenter = n % 2 == 0 ? 1 : 2;
        System.out.println("Factors of " + m + " : ");
        for (int i = 1; i <= Math.sqrt(m); i += increamenter) {
            if (m % i == 0) {
                System.out.print(i + " ");
                int r = m / i;
                if (i == r)
                    continue;
                else
                    System.out.print(r + " ");
            }
        }
    }
}

public class programming_exercise_1 {
    public static void main(String[] args) {
        Number num = new Number(15);
        System.out.println("Number = " + num.getNumber());
        System.out.println("Is Zero? : " + num.isZero());
        System.out.println("Is Positive? : " + num.isPositive());
        System.out.println("Is Negative? : " + num.isNegative());
        System.out.println("Is Odd? : " + num.isOdd());
        System.out.println("Is Even? : " + num.isEven());
        System.out.println("Is Prime? : " + num.isPrime());
        System.out.println("Is Armstrong? : " + num.isArmstrong());
        System.out.println("Factorial : " + num.getFactorial());
        System.out.println("Square root : " + num.getSqrt());
        System.out.println("Square : " + num.getSqr());
        System.out.println("Sum of Digits : " + num.sumOfDigits());
        System.out.println("Reverse : " + num.getReverse());
        num.dispBinary();
        num.listFactors();
    }
}
