import java.util.Scanner;

enum PlayDraw {
    ROCK(1),
    PAPER(2),
    SCISSOR(3);

    private int type;

    PlayDraw(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

}

public class _5b_rockScissorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       


        sc.close();
    }
}
