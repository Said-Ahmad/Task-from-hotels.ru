import java.util.Scanner;

public class Task {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


      //  System.out.println(42%2);

        while (true) {
            int number = scan.nextInt();

            System.out.println(count(number));
        }


    }

    private static String count(int number) {

        if (number % 10 == 1) {
            return number + " Компьютер";
        } else if (number % 10 == 2 || number % 10 == 3 || number % 10 == 4) {
            return number + " Компьютера";
        } else {
            return number + " Компьютеров";

        }

    }


}
