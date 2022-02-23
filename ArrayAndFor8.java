import java.util.Scanner;

public class ArrayAndFor8 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your String ");
        String myString = reader.nextLine();
        char [] vowels = {'a','e','i','o','u','A','E','I','O','U'};


        for (int i = 0; i<myString.length(); i++) {
            for (int j= 0; j<vowels.length;j++) {
                char enteredString = myString.charAt(i);
                char charVowels = vowels[j];
                if (enteredString == charVowels) {
                    String temp = Character.toString(charVowels);
                    myString = myString.replaceAll(temp, " ");
                }
            }
        } System.out.println("String without vowels is : " + '\n' + myString);
    }
}

//else System.out.println("You haven't vowels in String.");