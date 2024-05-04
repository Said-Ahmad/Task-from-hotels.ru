import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }


        int[] numbers = function(array);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0){

                System.out.print(numbers[i]+" ");
            }
        }


    }

    private static int[] function(int[] array) {

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max,array[i]);
        }
        int[] numbers = new int[max];
        int count = 0;
        int count1 = 0;
        for (int j = 2; j < 10; j++) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] % j == 0) {
                    count++;
                }
            }
            if (count == array.length){
                numbers[count1] = j;
                count1++;
            }
            count = 0;
        }
        return numbers;
    }
}
