import java.util.Scanner;

public class MinutesToSeconds {
    public static int minToSec(int min) {
        int result = -404;

        // LOGIC
        result = min * 60;

        return result;
    }

    public static void main(String[] args) {
        // INPUT
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.close();

        // OUTPUT
        System.out.println(minToSec(m));
    }
}
