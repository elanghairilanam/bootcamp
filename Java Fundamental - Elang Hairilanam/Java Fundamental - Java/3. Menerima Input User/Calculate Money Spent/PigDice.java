import java.util.Random;
import java.util.Scanner;

public class PigDice {

    public static void main(String[] args) {
        String name;
        int moneySpent, total, totalDay = 7;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate your money!!!");
        System.out.println("");
        System.out.println("Hey, what is your name:");
        name = input.next();
        System.out.println("How much money did you spend at the club on Monday");
        moneySpent = input.nextInt();

        total = moneySpent;

        System.out.println("How much money did you spend at the club on Tuesday");
        moneySpent = input.nextInt();

        total += moneySpent;

        System.out.println("How much money did you spend at the club on Wednesday");
        moneySpent = input.nextInt();

        total += moneySpent;

        System.out.println("How much money did you spend at the club on Thursday");
        moneySpent = input.nextInt();

        total += moneySpent;

        System.out.println("How much money did you spend at the club on Friday");
        moneySpent = input.nextInt();

        total += moneySpent;

        System.out.println("How much money did you spend at the club on Saturday");
        moneySpent = input.nextInt();

        total += moneySpent;

        System.out.println("How much money did you spend at the club on Sunday");
        moneySpent = input.nextInt();

        total += moneySpent;

        average = (double) total/totalDay;

        System.out.println("");
        System.out.println("The calculate result");
        System.out.println("");
        System.out.println("Hi "+ name +".");
        System.out.println("Your total expenditure at the club this week is $" + total);
        System.out.println("Whit an average daily expenditure of $"+average);

    }
}