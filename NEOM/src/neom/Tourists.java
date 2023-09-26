package neom;

import java.util.Scanner;

public class Tourists {

    private String Lname;
    private String Fname;
    private String phoneNumper;
    Scanner input = new Scanner(System.in);

    /**
     *
     */
    public Tourists() {
        Fname = "";
        Lname = "";
        phoneNumper = "";
    }

    /**
     *
     * @param Fn
     * @param Ln
     * @param phoneNO
     */
    public Tourists(String Fn, String Ln, String phoneNO) {
        Fname = Fn;
        Lname = Ln;
        phoneNumper = phoneNO;
    }

    /**
     *
     * @param object
     */
    public Tourists(Tourists object) {
        Fname = object.Fname;
        Lname = object.Lname;
        phoneNumper = object.phoneNumper;
    }

    /**
     *
     * @param F
     */
    public void setFname(String F) {
        Fname = F;
    }

    /**
     *
     * @param L
     */
    public void setLname(String L) {
        Lname = L;
    }

    /**
     *
     * @param N
     */
    public void setPhone(String N) {
        phoneNumper = N;
    }

    /**
     *
     * @return Fname
     */
    public String getFname() {
        return Fname.toUpperCase();
    }

    /**
     *
     * @return Lname
     */
    public String getLname() {
        return Lname.toUpperCase();
    }

    /**
     *
     * @return phoneNumper
     */
    public String getPhone() {
        return phoneNumper;
    }

    /**
     *ask user for the information
     */
    public void touristsInfo() {


        System.out.print("\nEnter your first name:");
        validFname(Fname);
        
        System.out.print("\nEnter your last name:");
        validLname(Lname);

        System.out.print("\nEnter your phone number:");
        phoneNumper = input.nextLine();
        validPhoneNumber(phoneNumper);
        setPhone(phoneNumper);
        

    }

    /**
     *
     * @param num
     */
    public void validPhoneNumber(String num) {
        // loop to to check the entered value
        if (num.length()< 10 || num.length() >= 11) {
            System.out.println("Your Phone number is Incorrect Please re-enter it again");
            System.out.print("\tPlease Enter your phone number\n");
            num = input.nextLine();
           phoneNumper = num;
           setPhone(phoneNumper);
        }
        

    }
    /**
     *
     * @param Fname
     */

    public void validFname(String Fname) {
        boolean flag;
        // loop to to check the entered value
        do {
            flag = true;
            Fname = input.nextLine();
            setFname(Fname);
            for (char c : Fname.toCharArray()) 
            {
                if (Character.isDigit(c) || Fname.length() < 2) 
                {
                    System.out.print("Invalid input, Try again:");
                    flag = false;
                    break;
                }
            }
            
        }while(!flag);
    
    
    }
    /**
     *
     * @param Lname
     * 
     */
    public void validLname(String Lname) {
        boolean flag;
        // loop to to check the entered value
        do {
            flag = true;
            Lname = input.nextLine();
            setLname(Lname);
            for (char c : Lname.toCharArray()) 
            {
                if (Character.isDigit(c) || Lname.length() < 2) 
                {
                    System.out.print("Invalid input, Try again:");
                    flag = false;
                    break;
                }
            }
            
        }while(!flag);
    
    
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "dear visitor " + getFname() + " " + getLname()
                + "\nyour phone number is " + getPhone();
    }

}


char input[50]; //string used to store user input
    int  inputAsAnInteger;//used store the converted input  as an integer
    int  inputSquared;// used to store the square of a valid integer.
 
    while(true)//loop 'infinitely'
    {
        printf("Enter an Integer value....\n");
        scanf("%s",&input);//get input from user
 
        printf("You entered : %s\n", input);
 
        inputAsAnInteger=atoi(input);//convert input to integer
 
        if (inputAsAnInteger==0)//if the input is not a number......
        {
            printf("Invalid input entered\n\n");
        }
        else//input is a number
        {
 
            inputSquared = inputAsAnInteger*inputAsAnInteger;//find square
            printf("\n%d squared is %d\n",inputAsAnInteger, inputSquared);
            printf("\nSuccess!  Exiting program\n");
            break;//exit 'infinite' loop.
        }
    }