import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        function(a);
    }

    private static void function(int a) {

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }


    }
}
