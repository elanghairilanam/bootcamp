import java.util.Scanner;

public class MenghitungHargaJual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int banyakBarang = Integer.valueOf(scanner.nextLine());

        String[] product = new String[banyakBarang];
        String[] label = new String[banyakBarang];
        int[] price = new int[banyakBarang];
        int[] laba = new int[banyakBarang];
        int[] hargaJual = new int[banyakBarang];

        for (int i = 0; i < banyakBarang; i++) {
            product[i] = scanner.nextLine();
            label[i] = scanner.nextLine();
            price[i] = Integer.valueOf(scanner.nextLine());
        }

        laba = getLabaPercentage(label);

        hargaJual = kalkulasiHargaJual(laba,price);

        printHasil(product,hargaJual);
    }

    public static int[] getLabaPercentage(String[] label){
        int[] percentage = new int[label.length];


        for (int i = 0; i < percentage.length; i++) {
            switch (label[i].toLowerCase()){
                case "best seller":
                    percentage[i] = 35;
                    break;
                case "recommended":
                    percentage[i] = 25;
                    break;
                case "good":
                    percentage[i] = 15;
                    break;
                default:
                    percentage[i] = 10;
                    break;
            }
        }

        return percentage;
    }

    public static int[] kalkulasiHargaJual(int[] laba, int[] price){
        int[] hargaJual = new int[laba.length];

        int hargaLaba = 0;

        for (int i = 0; i < hargaJual.length; i++) {
            hargaLaba = (laba[i] * price[i])/100;
            hargaJual[i] = price[i] + hargaLaba;
        }

        return hargaJual;
    }

    public static void printHasil(String[] produk, int[] hargaJual){
        for (int i = 0; i < produk.length; i++) {
            System.out.println(produk[i]);
            System.out.println(hargaJual[i]);
            System.out.println();
        }
    }
}
