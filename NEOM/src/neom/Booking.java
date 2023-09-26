package neom;

import java.util.Scanner;

public class Booking {

    private int bookList;
    public String bookMsg1;

    Scanner input = new Scanner(System.in);

    public Booking() {
        this.bookList = 0;
        this.bookMsg1 = null;
    }

    /**
     *
     * @param bookList
     * @param bookMsg1
     */
    public Booking(int bookList,String bookMsg1 ) {
        this.bookList = bookList;
        this.bookMsg1 = bookMsg1;
    }
    
    /**
     *
     * @param object
     */
    public Booking(Booking object) {
        bookMsg1=object.bookMsg1;
    }
    
    /**
     *
     * @param choice
     */
    public Booking(int choice){
        this.bookList=choice;
    }

    /**
     *
     * @return bookList
     */
    public int getBookList() {
        return bookList;
    }

    /**
     *
     * @param prices
     * @return prices
     */
    public int getPrices(int prices) {
        return prices;
    }

    /**
     *
     * @param bookList
     */
    public void setBookList(int bookList) {
        this.bookList = bookList;
    }
    
    /**
     *
     * @param bookList
     * @return price
     */
    // switch to book based on user entered number
    public int bookActivitey(int bookList) {
        while (bookList <= 0 || bookList > 4) {
            System.out.println("\tWrong input try again");
            System.out.print("\tPlease Enter your choice again ");
            bookList = input.nextInt();
        }
        
        int price = 0;
        switch (bookList) {
            case 1:
                price = 150;
                bookMsg1 = "your reservation for Archery Range Experiences has"
                        + " been confirmed";

                break;

            case 2:
                price = 100;
                bookMsg1 = "your reservation for Drone Zone has been confirmed";
                break;

            case 3:
                price = 250;
                bookMsg1 = "your reservation for hiking Experiences has been "
                        + "confirmed";
                break;

            case 4:
                price = 45;
                bookMsg1 = "your reservation for Kids Scientists Cnter has been "
                        + "confirmed";
                break;

            default:
                System.out.println("Sorry! we have only these Experiences/Activitey right now,"
                        + "Try again");
                break;
        }

        return price;
    }
    
    /**
     *
     * @return bookMsg1
     */
    @Override
    public String toString() {
        return bookMsg1 ;
    }
}
