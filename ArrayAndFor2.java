import java.util.Scanner;
public class ArrayAndFor2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Length of Array (max. 15 integers) ");
        int lengthOfArray = reader.nextInt();
        int[] mySecondArray = new int[lengthOfArray];
        int numberIteratorForOrder=0;
        String[] stringArray = new String[]{"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth"};

        for (int i=0; i<mySecondArray.length; i++) {
            if ((lengthOfArray>15) || (lengthOfArray<1)) {
                System.out.println("Error, Your Array is greater then 15 elements or 0");
                return;
            } else
            System.out.println("Please enter " + ++numberIteratorForOrder + " number");
            mySecondArray[i] = reader.nextInt();
        }
        for (int j=0; j<mySecondArray.length; j++) {
        System.out.println(stringArray[j] + " number in array: " + mySecondArray[j]);
        }
    }
}


//Napravite program koji moze za niz od 10 brojeva da ispise:
//First number in array: 123
//Second number in array: 23
//Third number in array: 3
//i da se ovakav ispis moze koristiti do 15 elementa u nizu.





