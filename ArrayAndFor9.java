import java.util.Scanner;
public class ArrayAndFor9 {
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
        int sum = 0;

        for (int i=0; i<firstArray.length;i++){
            for (int j=0; j<secondArray.length;j++){
                sum= sum + firstArray[i] + secondArray[j];
            }
        }
        System.out.println("Sum of elements in both Arrays are: " + sum);


    }
}
