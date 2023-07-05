import java.util.Random;
import java.util.Scanner;

public class PigDice {

    public static void main(String[] args) {
        String name, gender, dayOfReservation;
        int old = 0, attractive = 0, money = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Reservation Cafe");
        System.out.println("");
        System.out.println("Please insert your name:");
        name = input.next();

        System.out.println("\nWhat is your gender:");
        gender = input.next();

        System.out.println("\nHow old are you:");
        old = input.nextInt();

        System.out.println("\nHow attractive are you (1/10):");
        attractive = input.nextInt();

        System.out.println("\nHow much money do you have:");
        money = input.nextInt();

        System.out.println("\nWhat day do you want to make a reservation:");
        dayOfReservation = input.next();

        if(dayOfReservation.equalsIgnoreCase("Monday")){
            if ((old >= 20 && old <= 30) && money >= 500){
                System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nReservation Successfully, you can order on "+ dayOfReservation +"!!!. Young Night");

            }else {
                System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nSorry, you can't order on "+ dayOfReservation +"!!!.\nBecause its for Young Night");
            }
        }

        if (dayOfReservation.equalsIgnoreCase("Tuesday")){
            if ((old >= 31 && old <= 50) && money >= 250){
                System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nReservation Successfully, you can order on "+ dayOfReservation +"!!!. Oldest Night");

            }else {
                System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nSorry, you can't order on "+ dayOfReservation +"!!!.\nBecause its for Oldest Night");
            }
        }

        if (dayOfReservation.equalsIgnoreCase("Wednesday")){
            if (gender.equalsIgnoreCase("Female") && (old >= 20 && old <= 35) && attractive > 8 && money >= 300){
                System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nReservation Successfully, you can order on "+ dayOfReservation +"!!!. Ladies Night");

            }else {
                System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nSorry, you can't order on "+ dayOfReservation +"!!!.\nBecause its for Ladies Night");

            }
        }

        if (dayOfReservation.equalsIgnoreCase("Thursday")){
            if ((old >= 21 && old <= 30)){
                if (gender.equalsIgnoreCase("Female") && attractive >= 8 && money >= 300){
                    System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nReservation Successfully, you can order on "+ dayOfReservation +"!!!. Party Night for Single");
                }
                if (gender.equalsIgnoreCase("Male") && money >= 1000){
                    System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nReservation Successfully, you can order on "+ dayOfReservation +"!!!. Party Night for Single");
                }
            }else {
                System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nSorry, you can't order on "+ dayOfReservation +"!!!.\nBecause its for Party Night for Single");
            }
        }

        if (dayOfReservation.equalsIgnoreCase("Friday")){
            if (gender.equalsIgnoreCase("Female")) {
                if ((old >= 31 && old <= 45) && money >= 1000) {
                    System.out.println("\nHi " + name + ", thank you for using our application.\nFollowing Result for your Reservation:\nReservation Successfully, you can order on " + dayOfReservation + "!!!. Women Night");
                }
            } else if (gender.equalsIgnoreCase("Male")){
                if ((old >= 21 && old <= 25) && attractive >= 8){
                    System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nReservation Successfully, you can order on "+ dayOfReservation +"!!!. Women Night");
                }
            }else {
                System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nSorry, you can't order on "+ dayOfReservation +"!!!.\nBecause its for Women Night");
            }
        }

        if(dayOfReservation.equalsIgnoreCase("Sunday") || dayOfReservation.equalsIgnoreCase("Saturday")){
            if ((old >= 18 && old <= 60) && money >= 100){
                System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nReservation Successfully, you can order on "+ dayOfReservation +"!!!. Weekend Freedom");

            }else {
                System.out.println("\nHi "+ name + ", thank you for using our application.\nFollowing Result for your Reservation:\nSorry, you can't order on "+ dayOfReservation +"!!!.\nBecause its for Weekend Freedom");
            }
        }
    }
}