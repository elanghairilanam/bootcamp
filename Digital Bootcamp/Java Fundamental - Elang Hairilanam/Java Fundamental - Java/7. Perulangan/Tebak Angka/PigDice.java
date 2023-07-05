import java.util.Random;
import java.util.Scanner;

public class PigDice {

    public static void main(String[] args) {
        int inputUser = 0;
        int round = 0;

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        System.out.println("Tebak angka dari 1-10");


        do {

            System.out.println("\nMasukan angka yang tebakan anda:");
            inputUser = input.nextInt();

            if (inputUser == randomNumber){
                System.out.println("\nTebakan anda benar, angka yang dimaksud adalah: "+randomNumber);
                break;
            }

            else if (randomNumber - inputUser == 3 || randomNumber + inputUser == 3){
                System.out.println("Cold");

            }else if (randomNumber - inputUser == 2 || randomNumber + inputUser == 2){
                System.out.println("Warm");

            }else if (randomNumber - inputUser == 1 || randomNumber + inputUser == 1){
                System.out.println("Hot");

            }else {
                System.out.println("Angka yang anda masukan terlalu jauh dari angka yang dimaksud");
            }

            round++;
        }while (round < 3);

        if (randomNumber != inputUser){
            System.out.println("Kesempatan anda habis");

        }

    }
}