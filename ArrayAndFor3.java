import java.util.Scanner;

public class ArrayAndFor3 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your Length of Array ");
        int lengthArray = reader.nextInt();
        int[] array = new int [lengthArray];
        int counter = 0;

        for (int i=0; i<array.length; i++) {
            System.out.println("Please enter: " + ++counter + " number");
            array[i] = reader.nextInt();
        }
        System.out.print("Your Array is: ");
        for (int j=0; j<array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.print('\n' + "Your reverse Array is: ");
        for (int k=array.length-1; k>=0; k--){
            System.out.print(array[k] + " ");
        }

    }
}

//
//Napravite program koji ce obrnuti redosljed niza odnosno:
//1 2 3 4 5 6 7   postaje 7 6 5 4 3 2 1
//i da moze primiti bilo koji niz i obrnuti ga.
