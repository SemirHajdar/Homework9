import java.util.Scanner;
public class ArrayAndFor4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please Enter your word and check is it Palindrome: ");
        String word = reader.nextLine();
        String reverseWord = "";

        char [] ArrayWord = word.toCharArray();

        System.out.print("Yor word is: ");
        for (int i=0; i<ArrayWord.length; i++) {
            System.out.print(ArrayWord[i] + " ");

        }

        System.out.print('\n'+ "Yor reverse word is: ");
        for (int j=ArrayWord.length-1; j>=0;j--){
            System.out.print(ArrayWord[j] + " ");
            reverseWord = reverseWord + ArrayWord[j];
        }

        if (word.equals(reverseWord)){

            System.out.println('\n'+ "The word is a Palindrome.");
        }else
            System.out.println('\n'+ "The word isn't a Palindrome.");
        }
        }

//Napravite program koji provjerava da li je rijec palindrom
//inace mozete koristiti metodu toCharArray() da string pretvorite u niz char-ova.