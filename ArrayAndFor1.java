import java.util.Scanner;

public class ArrayAndFor1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Length of Array ");
        int lengthOfArray = reader.nextInt();
        int [] myFirstIntArray = new int [lengthOfArray];
        System.out.println("Please enter " + myFirstIntArray.length +" integers");
        int numberIterator=0;
        int numberIteratorForOrder=0;

        for (int i=0; i<myFirstIntArray.length;i++){
            System.out.println("Please enter "+ ++numberIterator + " number:");
            myFirstIntArray[i]=reader.nextInt();
        }
        System.out.println('\n' + "Numbers contained in Array: ");

        for(int i=0; i<myFirstIntArray.length; i++){
            System.out.println(myFirstIntArray[i] + " is " + ++numberIteratorForOrder + ". number in Array." );
            if (myFirstIntArray[i]%2==0){
                System.out.println("Number is Even");
            } else
                System.out.println("Number is Odd");
            if (myFirstIntArray[i]>10){
                System.out.println("Number is greather than 10 " + '\n');
            }
        }
    }
}

//Napravite program kojem mozete pri pokretanju reci koliki niz zelite zatim da popunite niz sa int brojevima.
//Na ispisu svih brojeva kod mora ispisati redosljed(ne index) u nizu, da li je paran ili ne kao i da li je veci od 10.
