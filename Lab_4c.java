import square.squsre;
import cube.cube;
import java.util.Random;

abstract class abs {
    int[] arr = new int[10];
    abstract void generateRandomNumbers();
    abstract int[] getArr();
}

class GenRandomNums extends abs {
    void generateRandomNumbers() {
        Random sc = new Random();
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt(100);
    }

    int[] getArr() {
        return arr;
    }
}

class genSqauresAndcubes extends GenRandomNums {
    int s[] = getArr();

    void generateRandomNumbers() {
        super.generateRandomNumbers();
    }

    square sq = new squsre();
    cube cb = new cube();

    void display() {
        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    void displaySqaures() {
        System.out.print("Sqaures: ");
        for(int i = 0; i < s.length; i++)
            System.out.print(sq.findSqaure(s[i]) + " ");
        System.out.println();
    }

    void displayCubes() {
        System.out.print("Cubes: ");
        for(int i = 0; i < s.length; i++)
            System.out.print(cb.findCube(s[i]) + " ");
        System.out.println();
    }
}

public class _4c_SquareAndCube extends genSqauresAndcubes {

    public static void main(String[] args) {

        genSqauresAndcubes sqAndcb = new genSqauresAndcubes();

        sqAndcb.generateRandomNumbers();
        sqAndcb.display();
        sqAndcb.displaySqaures();
        sqAndcb.displayCubes();
    }
}
