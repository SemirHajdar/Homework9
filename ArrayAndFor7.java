import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndFor7 {
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
        counter = 0;
        System.out.println("Please enter the length of Second Array: ");
        int lenOfSecondArray = reader.nextInt();
        int[] secondArray = new int[lenOfSecondArray];
        for (int j = 0; j < secondArray.length; j++) {
            System.out.println("Please enter " + ++counter + " number of second Array: ");
            secondArray[j] = reader.nextInt();
        }
        if (firstArray.length < secondArray.length) {
            int[] temp = new int[secondArray.length];
            temp = firstArray;
            firstArray=secondArray;
            secondArray=temp;
        }
        int [] thirdArray = new int[firstArray.length];
        System.out.println(firstArray.length + " " + secondArray.length);
        for (int i=0; i<firstArray.length; i++) {
            if (i < secondArray.length) {

                thirdArray[i] = firstArray[i] + secondArray[i];

            } else {
                thirdArray[i] = firstArray[i];
            }
        } System.out.println(Arrays.toString(thirdArray));
        }
    }
//NApravite program koji ce sabrati dva niza zajedno, ukoliko je jedan niz veci od drugog
//taj broj se samo prepise .
//Npr: {1,3,5,6} , {1,1,1,1,1,1,1}Output: 2,4,6,7,1,1,1
