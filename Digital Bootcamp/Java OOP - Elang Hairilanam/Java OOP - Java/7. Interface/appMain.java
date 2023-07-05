import Childs.*;
import Interface.Phone;
import Parents.Person;
import Parents.Product;
import Parents.Shape;

import java.util.Scanner;

public class appMain {
    public static void main(String[] args) {
        Phone redmiNote10 = new Xiaomi();

        phoneUser dian = new phoneUser(redmiNote10);

        Scanner input = new Scanner(System.in);

        String aksi;
        boolean isLoping = false;

        System.out.println("\n Nyalakan HP?(y/n)");
        aksi = input.next();

        if (aksi.equalsIgnoreCase("y")){
            isLoping = true;
            dian.turnOnThePhone();
        }

        do {

            System.out.println("\nAplikasi Interface");
            System.out.println("[1] Matikan HP");
            System.out.println("[2] Perkecil Volume");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[0] Keluar");

            System.out.println("\nPilih aksi : ");
            aksi = input.next();

            if (aksi.equalsIgnoreCase("1") ){
                dian.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                dian.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("3")) {
                dian.makePhoneLouder();
            }else {
                break;
            }

        }while (isLoping);

    }
}
