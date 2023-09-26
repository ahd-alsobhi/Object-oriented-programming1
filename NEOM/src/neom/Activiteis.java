package neom;

import java.util.*;

class Sorting {

    String name;
    String date;
    String age;
    int price;

    // Constructor for class 
    // for initializing objects
    Sorting(String name, String date, String age, int price) {
        // This keyword for efering to current object
        this.name = name;
        this.date = date;
        this.age = age;
        this.price = price;
    }
}

public class Activiteis {


    Activiteis() {
   
    }
    
    /**
     *available Activiteis list
     */
    public void availableActiviteis() {

      
        System.out.println("\n\n\t1.Archery Range Experiences\n"
                        + "\n\tAbout\n"                        
                        + "\n\tFamily fun games with outdoor seating"                        
                        + "\n\n\tDATE\n"
                        + "\t2021-03-11\n"
                        + "\n\tTARGET AUDIENCE\n"
                        + "\tFamily\n"
                        + "\n\tPRICE\n"
                        + "\t150");

                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                
                System.out.println("\n\n\t2.Drone Zone\n"
                        + "\n\tAbout\n"                        
                        + "\n\tHere, you'll be taught and trained to drive drones"
                        + "\n\tby professionals on specific tracks inside a tent"                        
                        + "\n\n\tDATE\n"
                        + "\t2021-03-20\n"
                        + "\n\tTARGET AUDIENCE\n"
                        + "\tAdult only\n"
                        + "\n\tPRICE\n"
                        + "\t100");

                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                
                System.out.println("\n\n\t3.hiking Experiences\n"
                        + "\n\tAbout\n\n"                        
                        + "\n\tfun time with outdoor seating"                        
                        + "\n\n\tDATE\n"
                        + "\t2021-03-13\n"
                        + "\n\tTARGET AUDIENCE\n"
                        + "\tAdult only\n"
                        + "\n\tPRICE\n"
                        + "\t250");

                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                               
                System.out.println("\n\n\t4.Kids Scientists Cnter\n"
                        + "\n\tAbout\n\n"                        
                        + "\n\tKids Scientists Center offers you the"
                        + "\n\tchance to discover your child's"                        
                        + "\n\n\tDATE\n"
                        + "\t2021-03-13\n"
                        + "\n\tTARGET AUDIENCE\n"
                        + "\tkids only\n"
                        + "\n\tPRICE\n"
                        + "\t45");
        
        }
    
    /**
     *
     * @param ActiviteisList
     */
    public static void sortActiviteis(int ActiviteisList) {
        Sorting s1 = new Sorting("\nArchery Range Experiences\nFamily fun games with outdoor seating",
                "\n2021-03-11", "Family", 150);
        
        Sorting s2 = new Sorting("\nDrone Zone\nHere, you'll be taught and trained to drive drones "
                + "\nby professionals on specific tracks inside a tent", "\n2021-03-20", "Adult only", 100);
        
        Sorting s3 = new Sorting("\nhiking Experiences\n", "\n2021-03-13", "Adult only", 250);
        
        Sorting s4 = new Sorting("\nKids Scientists Cnter\n\nKids Scientists Center offers you the "
                + "\nchance to discover your child's", "\n2021-03-23", "kids only", 45);

        ArrayList<Sorting> sortList = new ArrayList<Sorting>();

        sortList.add(s1);
        sortList.add(s2);
        sortList.add(s3);
        sortList.add(s4);

        switch (ActiviteisList) {

            case 1:
                System.out.print("Sorted List: \n");
                
                System.out.println(sortList.get(0).name);
                System.out.println(sortList.get(0).date);
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println(sortList.get(1).name);
                System.out.println(sortList.get(1).date);
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println(sortList.get(2).name);
                System.out.println(sortList.get(2).date);
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println(sortList.get(3).name);
                System.out.println(sortList.get(3).date);

                
                break;

            case 2:

                System.out.println(sortList.get(0).name);
                System.out.println(sortList.get(0).age);
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println(sortList.get(1).name);
                System.out.println(sortList.get(1).age);
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println(sortList.get(2).name);
                System.out.println(sortList.get(2).age);
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println(sortList.get(3).name);
                System.out.println(sortList.get(3).age);
                
                
                break;
            case 3:

                System.out.println(sortList.get(0).name);
                System.out.println(sortList.get(0).price);
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println(sortList.get(1).name);
                System.out.println(sortList.get(1).price);
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println(sortList.get(2).name);
                System.out.println(sortList.get(2).price);
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println(sortList.get(3).name);
                System.out.println(sortList.get(3).price);
                
                break;

        }

    }
        
}

