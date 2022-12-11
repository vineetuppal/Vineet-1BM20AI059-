package Java_Programs_Assignment;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    double m1, m2, m3;

    A(double m1, double m2, double m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    @Override
    double getPercentage() {
        double totalMarks = m1 + m2 + m3;
        double percentage = totalMarks / 3;
        return percentage;
    }
}

class B extends Marks {
    double m1, m2, m3, m4;

    B(double m1, double m2, double m3, double m4) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }

    @Override
    double getPercentage() {
        double totalMarks = m1 + m2 + m3 + m4;
        double percentage = totalMarks / 4;
        return percentage;
    }

}

public class programming_exersice_3 {
    public static void main(String[] args) {
        A a = new A(58, 96, 85);
        System.out.print("Percentage of student A: ");
        System.out.println(a.getPercentage());

        B b = new B(98, 65, 87, 75);
        System.out.print("Percentage of student B: ");
        System.out.println(b.getPercentage());
    }
}
