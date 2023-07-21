import java.util.Scanner;

public class Array2Dimensi {
    public static void main(String[] args) {

        int[][] array = new int[4][4];

        insertArrayInput(array);

        int bilanganGanjil = getBilanganGanjil(array);

        System.out.println(bilanganGanjil);
    }

    public static void insertArrayInput(int[][] arr){

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static int getBilanganGanjil(int[][] arr){

        int bilanganGanjil = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] % 2 == 1){
                    bilanganGanjil++;
                }
            }
        }

        return bilanganGanjil;
    }

}
