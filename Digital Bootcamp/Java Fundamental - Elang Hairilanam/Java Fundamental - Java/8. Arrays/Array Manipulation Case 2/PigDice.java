import java.util.Random;
import java.util.Scanner;

public class PigDice {

    public static void main(String[] args) {
        int[] numbers = {3,2,5,11,7,10,11,3,15,11,17,10,5};

        int indexTarget = 0;
        int inputUser = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Merubah nilai dari array Numbers!!!");
        System.out.println("Array Numbers:");
        System.out.println("{3,2,5,11,7,10,11,3,15,11,17,10,5}");
        System.out.println("");
        System.out.print("Masukan posisi yang ingin diganti (1-13): ");
        indexTarget = input.nextInt();

        if (indexTarget > numbers.length){
            System.out.println("Posisi yang anda input melebihi 13");
            System.exit(0);
        }

        System.out.print("Masukan nilai: ");
        inputUser = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            numbers[indexTarget-1] = inputUser;
        }

        if (indexTarget-1 < numbers.length){
            for ( int n : numbers ) {
                System.out.print(n+" ");
            }
        }
    }
}