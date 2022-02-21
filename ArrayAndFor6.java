import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndFor6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] firstArray = new int[2];
        int[] secondArray = new int[2];
        int lenFirst = firstArray.length;
        int lenSecond = secondArray.length;
        int [] newArray = new int [lenFirst+lenSecond];
        int counter = 0;
        int secondCounter = 0;

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Please enter " + ++counter + " number of first Array: ");
            firstArray[i] = reader.nextInt();
        }
        for (int j = 0; j < secondArray.length; j++) {
            System.out.println("Please enter " + ++secondCounter + " number of second Array: ");
            secondArray[j] = reader.nextInt();
        }
        System.arraycopy(firstArray,0,newArray,0,lenFirst);
        System.arraycopy(secondArray,0,newArray,lenFirst,lenSecond);
        System.out.println(Arrays.toString(newArray));
        }
    }

//Napravite program koji ce objediniti dva niza u jedan veliki niz.