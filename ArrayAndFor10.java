import java.sql.SQLInvalidAuthorizationSpecException;
import java.util.Scanner;

public class ArrayAndFor10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the length of First Array: ");
        int lenOfFirstArray = reader.nextInt();
        int[] firstArray = new int[lenOfFirstArray];
        int counter = 0;
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Please enter " + ++counter + " number of first Array: ");
            firstArray[i] = reader.nextInt();
        }

        for (int j = 0; j < firstArray.length; j++) {
            if ((firstArray[j] % 3 == 0) && (firstArray[j] % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (firstArray[j] % 3 == 0) {
                System.out.println("Fizz");
            } else if (firstArray[j] % 5 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(firstArray[j]);
        }
//        int [] newarr = null;
//        for (int k = 0 ; k<firstArray.length; k++) {
//            if ((k % 3 == 0) && (k % 5 == 0)) {
//
////                System.out.print(firstArray[] + " ");
            }
        }





