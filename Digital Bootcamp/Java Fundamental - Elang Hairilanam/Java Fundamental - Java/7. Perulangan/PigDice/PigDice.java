import java.util.Random;
import java.util.Scanner;

public class PigDice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ptot = 0, ctot = 0, roll = 0, cTurn = 0, pTurn=0;
        String play = "rolled";

        Random random = new Random();

        do {

            System.out.println("Computer has "+ ctot +" points.");

            if (ctot < 50 && cTurn < 10 ) {
                int randomNumber;

                do {

                    randomNumber = random.nextInt(6) + 1;

                    System.out.println("Computer rolled a " + randomNumber + ".");

                    if (randomNumber == 1) {
                        System.out.println("Thas ends its turn");
                        cTurn = 10;
                    }

                    if (randomNumber != 1){
                        ctot += randomNumber;
                    }

                    System.out.println("Computer has " + ctot + " points so far this round.");

                    if (cTurn < 10 && ctot < 50) {
                        System.out.println("Computer will roll again");
                        cTurn++;
                    } else {
                        System.out.println("Thas ends its turn");
                        break;
                    }

                } while (randomNumber != 1 && cTurn < 10);
            }

            if (cTurn == 10 && ctot < 50) {

                System.out.println("You has " + ptot + " points.");

                int randomNumber;

                do {

                    randomNumber = random.nextInt(6) + 1;


                    System.out.println("You rolled a " + randomNumber + ".");

                    if (randomNumber == 1) {
                        System.out.println("Thats ends its turn");
                        pTurn = 10;
                    }

                    if (randomNumber != 1){
                        ptot += randomNumber;
                    }

                    System.out.println("You has " + ptot + " points so far this round.");

                    if (pTurn < 10) {
                        System.out.println("Whould you like to \"rolled\" or \"hold\" will roll again?");
                        play = input.next();
                        pTurn++;
                    } else {
                        System.out.println("Thats ends your turn");
                        break;
                    }

                } while (randomNumber != 1 && pTurn < 10 && play.equalsIgnoreCase("rolled"));
            }
        }while (ptot < 50 && ctot < 50 && pTurn < 10 && play.equalsIgnoreCase("rolled"));


        System.out.println("Human Score: "+ ptot);
        System.out.println("Computer Score: "+ctot);

        if (ptot > ctot){
            System.out.println("Humanity win");
        }

        else if (ptot == ctot) {
            System.out.println("Draw");
        } else {
            System.out.println("Computer win");
        }
    }
}