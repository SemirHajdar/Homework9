import java.util.Scanner;
public class ArrayAndFor5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the lower number of range: ");
        int lowerNumber = reader.nextInt();

        System.out.println("Please enter the larger number of range: ");
        int largerNumber = reader.nextInt();

        int [] array = new int [largerNumber];

        System.out.println("Even numbers in range from " +lowerNumber + " to " + largerNumber + " are: ");

        for (int i=lowerNumber+1; i<largerNumber; i++){

            if (i % 2 == 0) {

                System.out.print(i+ " ");

            }
            }
        }
    }


//Napravite program  kojem cemo reci opseg za koji ce morat ispisati sve parne brojeve u koje ne ulaze brojevi kojima postavljamo opseg
//npr
//Please enter lower number in range:
//10
//Please enter larger number in range:
//16System-Out: Even numbers for range: 10 to 16 are:
//12,14
