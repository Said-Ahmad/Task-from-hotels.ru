import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(Arrays.toString(function(a, b)));


    }

    private static int[] function(int a, int b) {
        int length = ((b - a) / 2) + 1;
        System.out.println(length);
        int[] numbers = new int[length];
        int counter = 0;
        while (a <= b) {
            numbers[counter] = a;
            a += 2;
            counter++;
        }

        return numbers;

    }
}
