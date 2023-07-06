import java.util.Scanner;

public class appMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input  = scanner.next();

        int jumlahLubang = hitungJumlahLubang(input);

        System.out.println(jumlahLubang);
    }

    public static int hitungJumlahLubang(String string) {
        int lubang = 0;

        String[] letterHoles = {"A", "B", "D", "O", "P", "Q", "R","a","b","e","d","g","o","p","q","8","9","6","4"};

        for (int i = 0; i < letterHoles.length; i++) {
            for (int j = 0; j < string.length(); j++) {
                String letter = string.substring(j, j + 1);
                if (letter.equals(letterHoles[i])) {
                    switch (letter) {
                        case "B":
                            lubang += 2;
                            break;

                        case "8":
                            lubang += 2;
                            break;

                        default:
                            lubang += 1;
                            break;
                    }
                }
            }
        }

        return lubang;
    }
}
