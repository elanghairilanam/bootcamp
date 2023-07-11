import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int[][] matriks = new int[input][input];

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (j == i) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}