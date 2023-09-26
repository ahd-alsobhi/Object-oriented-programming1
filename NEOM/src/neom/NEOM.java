package neom;

//import needed 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NEOM {

    public static void main(String[] args) throws FileNotFoundException {

        int userChoice = 0;    // hold the user choice for the list options
        int PFChoice = 0;      // hold the user choice for the city Facilities list options
        int option = 0;        // hold the user choice to sort the Activiteis list 
        int ACTChoice = 0;     // hold the user choice for the city Activiteis list options
        int bookChoice = 0;    // hold the user choice for book Activitey
        int ACTprice = 0;      // hold the price of the Activitey
        int numOfTicket = 0;   // hold the number of ticket
        int total = 0;         // hold the totale price of Service

        //creating object from deffrint classes
        Scanner input = new Scanner(System.in);
        City cityFacilitiesInfo = new City();
        Activiteis ActiviteisInfo = new Activiteis();
        Activiteis diplayActiviteis = new Activiteis();
        Booking bookActiviteis = new Booking();
        Tourists Touristsinfo = new Tourists();

        // welcoming to the system
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("**                                                                 **");
        System.out.println("**                    HELLO WORLD! HELLO NEOM!                     **");
        System.out.println("**                                                                 **");
        System.out.println("**                  Your personal guide to Neom                    **");
        System.out.println("**                                                                 **");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");

        //ask the user to choose one serves        
        System.out.print("\nchoose one serves:"
                + "\n\tchoose 1 for: show public facilities"
                + "\n\tchoose 2 for: Show activiteis"
                + "\n\tchoose 3 for: book activiteis");
        System.out.print("\n\nEnter your Choice :  ");
        userChoice = input.nextInt();

        // loop to to check the entered value
        while (userChoice <= 0 || userChoice > 3) {
            System.out.println("\tWrong input try again");
            System.out.print("\tPlease enter your choose again\n");
            userChoice = input.nextInt();
        }
        System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");

        if (userChoice == 1) {
            System.out.print("choose one:"
                    + "\n\tchoose 1 for: hotel"
                    + "\n\tchoose 2 for: parks"
                    + "\n\tchoose 3 for: restorant");

            System.out.print("\n\nEnter your Choice :  ");
            PFChoice = input.nextInt();
            System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
            cityFacilitiesInfo.public_facilities(PFChoice);

        } else if (userChoice == 2) {
            System.out.print("Do you want to sort activiteis? \n\tchoose 1: for Yes \n\tchoose 2: for No ");
            System.out.print("\n\nEnter your Choice :  ");
            option = input.nextInt();
            System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");

            if (option == 1) {
                System.out.print("sort by?"
                        + "\n\tchoose 1 for: Date"
                        + "\n\tchoose 2 for: [adults - Family - kids]"
                        + "\n\tchoose 3 for: price");
                System.out.print("\n\nEnter your Choice :  ");
                ACTChoice = input.nextInt();

                // loop to to check the entered value
                while (ACTChoice <= 0 || ACTChoice > 3) {
                    System.out.println("\tWrong input try again");
                    System.out.print("\tPlease enter your choose again\n");
                    ACTChoice = input.nextInt();
                }

                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                ActiviteisInfo.sortActiviteis(ACTChoice);

            } else if (option == 2) {

                System.out.print("\nthis is all tha activiteis ");
                diplayActiviteis.availableActiviteis();

            }

        } else if (userChoice == 3) {
            System.out.print("\nwitch one do you want to book?"
                    + "\n\tchoose 1 for: Archery Range Experiences"
                    + "\n\tchoose 2 for: Drone Zone"
                    + "\n\tchoose 3 for: hiking Experiences"
                    + "\n\tchoose 4 for: Kids Scientists Cnter");

            System.out.print("\n\nEnter your Choice :  ");

            bookChoice = input.nextInt();
            bookActiviteis.bookActivitey(bookChoice);
            System.out.print("\nhow many ticket do you want?\n");
            numOfTicket = input.nextInt();

            input.nextLine();
            System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");

            // method call to ask user for the information
            Touristsinfo.touristsInfo();
            System.out.println("\nThank you for reservation! can't wait to see you");

            //calculation
            ACTprice = bookActiviteis.bookActivitey(bookChoice);
            total = ACTprice * numOfTicket;

            System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");

            reservation ob = new reservation(Touristsinfo, bookActiviteis);
            // The Array List for class reservation
            ArrayList<reservation> ac = new ArrayList<>();
            ac.add(ob);

            // Write into a file
            try (
                    PrintWriter outputFile = new PrintWriter("reservation.txt")) {
                outputFile.println(ac);
                // close the file after the write
            }

            // read from a file 
            File file = new File("reservation.txt");
            // print detalis
            try (Scanner inputFile = new Scanner(file)) {
                // print detalis
                System.out.println(ob);
                // close the file

            }

            System.out.println("The totale of your book " + total);
            //end the program

        }

    }
}
