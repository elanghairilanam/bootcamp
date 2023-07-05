import java.util.Random;
import java.util.Scanner;

public class PigDice {

    public static void main(String[] args) {
        int[] numbers = {3,2,5,11,7,10,11,3,15,11,17,10,5};
        int jumlahNumbers = 0;

        int inputUser = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Mencari angka yang ada di Array Numbers!!!");
        System.out.println("Array Numbers:");
        System.out.println("{3,2,5,11,7,10,11,3,15,11,17,10,5}");
        System.out.println("");
        System.out.print("Masukan angka yang anda cari: ");
        inputUser = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (inputUser == numbers[i]){
                jumlahNumbers++;
            }
        }

        int[] indexNumbers = new int[jumlahNumbers];

        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (inputUser == numbers[i]) {
                if (i != 0){
                    indexNumbers[index] = i;
                    index++;
                }
            }
        }

        if (jumlahNumbers > 0){
            System.out.println("Angka "+ inputUser +" yang anda cari ada di dalam array numbers.");
            System.out.println("Ada "+ jumlahNumbers + " angka "+ inputUser +" di dalam numbers.");
            System.out.println("Yaitu pada index ke: ");
            for (int iN: indexNumbers) {
                System.out.print(iN+" ");
            }
        }else {
            System.out.println("Angka yang anda masukan tidak ada di dalam array.");
        }
    }
}