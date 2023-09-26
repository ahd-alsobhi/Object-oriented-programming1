
package neom;

public class reservation {

    private Tourists touristsInfo;
    private Booking touristsBook;
    
    /**
     *
     * @param touristsInfo
     * @param touristsBook
     */
    public reservation(Tourists touristsInfo, Booking touristsBook) {
        this.touristsInfo = new Tourists(touristsInfo);
        this.touristsBook = new Booking(touristsBook);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\n\nAll information of the reservation\n" + "tourists Info:\n" + touristsInfo + "\n" + touristsBook;
    }

}
