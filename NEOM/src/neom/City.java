package neom;

import java.util.Scanner;

public class City {

      Scanner input = new Scanner(System.in);

    /**
     *
     * @param publicFacilitiesList
     */
    public void public_facilities(int publicFacilitiesList) {

        // loop to to check the entered value
        while (publicFacilitiesList <= 0 || publicFacilitiesList > 3) {
            System.out.println("\tWrong input try again");
            System.out.print("\tPlease enter your choose again");
            publicFacilitiesList = input.nextInt();
        }
        
        // switch to display public Facilities based on user entered number
        switch (publicFacilitiesList) {
            case 1:

                System.out.println("1.Royal Tulip Sharma Resort\n"
                        + "\nAbout\n\n"
                        + " 4.5\\5"
                        + "\n The Best 5 Star Sea Resort allover Kingdom of Saudi Arabia:"
                        + "\n (Saudi Excellence Tourism Award 2017)\n"
                        + "\nProperty amenities\n"
                        + "Free parking - Free High Speed Internet - Pool - "
                        + "Fitness Center with Gym / Workout Room \n"
                        + "-Free breakfast - Beach - Bicycle rental - Babysitting - Spa - Restaurant \n"
                        + "\nRoom types\n"
                        + "Non-smoking rooms - Suites - Family rooms \n"
                        + "\nLANGUAGES SPOKEN\n"
                        + "English, Arabic, Hindi");

                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println();

                System.out.println("2.Grand Millennium Tabuk\n"
                        + "\nAbout\n\n"
                        + " 4.5\\5"
                        + "\n218 spacious and elegant rooms & suites. Grand ballroom for "
                        + "\nweddings and events with total space of 1082 sqm. 5 meeting "
                        + "\nrooms with a total meeting space of 283 sqm equipped with "
                        + "\nstate-of-the-art modern. Ladies and Gent’s gymnasium, indoor "
                        + "\nswimming pool, sauna steam & Jacuzzi"
                        + "\nProperty amenities\n"
                        + "Free parking - Free High Speed Internet - Pool - "
                        + "Fitness Center with Gym / Workout Room \n"
                        + "-Free breakfast - Airport transportation - Valet parking - Spa - Restaurant \n"
                        + "\nRoom types\n"
                        + "Non-smoking rooms - Suites - Family rooms - Smoking rooms available\n"
                        + "City view - Pool view - Bridal suite - \n"
                        + "\nLANGUAGES SPOKEN\n"
                        + "English, Arabic, Hindi ,French , Urdu");
                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println();

                System.out.println("3.The Ritz-Carlton\n"
                        + "Saudi Arabia's only palatial hotel and a premiere destination for luxury conferences.\n"
                        + "Our hotel in Jeddah set on the Red Sea encapsulates the mystique of the Kingdom of Saudi\n"
                        + "Arabia through its unique location, and for its regal architecture and design.\n"
                        + "\nAbout\n\n"
                        + "4.5\\5"
                        + "\nProperty amenities\n"
                        + "Free parking - Free High Speed Internet - Pool -- Restaurant\n"
                        + "Fitness Center with Gym / Workout Room - Conference facilities\n"
                        + "Free breakfast - Airport transportation - Business Center with Internet Access - Spa \n"
                        + "\nRoom types\n"
                        + "Non-smoking rooms - Suites - Family rooms\n"
                        + "City view - Ocean view - Bridal suite - \n"
                        + "\nLANGUAGES SPOKEN\n"
                        + "English, Arabic");

                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println();
                
                System.out.println("4.Crowne Plaza, an IHG hotel\n"
                        + "A vibrant 5 star hotel for business, dining &relaxation. Upscale business and leisure amenities\n"
                        + "await at Crowne Plaza hotel,a half-hour drive from the International Airport.We are next to the\n"
                        + "diplomatic and financial district's steel and glass towers, & nearby the city’s sculpture lined\n"
                        + "Corniche curves alongside the glimmering Red Sea perfect for an evening stroll. If you’re organi\n"
                        + "-zing conference,our Crowne Meetings Manager is at your service to ensure a successful experience\n"
                        + "It’s easy to stay connected with complimentary WiFi.From all-day dining at Al Zahra Restaurant to\n"
                        + "prime steaks grilled to perfection, in addition to the famous Japanese Restaurant Sakura there’s \n"
                        + "dining option to suit your needs. Work up an appetite with some laps of the outdoor pool,burn some\n"
                        + "calories in the modern Fitness Center or simply gather your thoughts in the sauna\n"
                        + "\nAbout\n\n"
                        + "4.5\\5"
                        + "\nProperty amenities\n"
                        + "Free parking - Free High Speed Internet - Pool -- Restaurant\n"
                        + "Fitness Center with Gym / Workout Room - Conference facilities\n"
                        + "Free breakfast - Airport transportation - Business Center with Internet Access - Spa \n"
                        + "\nRoom types\n"
                        + "Non-smoking rooms - Suites - Family rooms\n"
                        + "City view - Ocean view - Bridal suite - \n"
                        + "\nLANGUAGES SPOKEN\n"
                        + "English, Arabic");

                break;

            case 2:
                System.out.println("1.Greenland Park\nPreview\n"
                        + "Perfect place for friends & family gathering\n"
                        + "It has a playground with many games suitable for children especially small ages,\n"
                        + "and contains inside the zoo contains various types of "
                        + "animals and birds that children see and feed, \n"
                        + "and therefore enjoy their time with great fun,"
                        + " and the garden includes green spaces and large areas, \n"
                        + "allowing families to sit and relax, Or walking and hiking.\n"
                        + "\nPark Area: 2000000.00 SQM\n"
                        + "\nIntertainment Elements:\n"
                        + "Track - Sports - Sitting places - Entertainment - Restaurants "
                        + "- Trips - Kids area - Small animal park\n "
                        + "\nAddress\n"
                        + "King Saud Road, AL Mahrgan, Tabuk, Saudi Arabia\n");

                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println();
                
                System.out.println("2.Prince Fahad Bin Sultan Park\nPreview\n"
                        + "One of the most beautiful places and the only outlet Tabuk\n"
                        + "Prince Fahad bin Sultan's Park is located in Tabuk.It is the "
                        + "\nheadquarters of the Principality of the Tabuk region and the"
                        + "\nlargest cities in the north of the Saudi Arabia and around "
                        + "\nit are some of the most important monuments in the Arabian"
                        + "\nPeninsula,where Tabuk region is the northern gate of the Arabian"
                        + "\nPeninsula and a vital route for trade and pilgrims and Umrah from"
                        + "\noutside the Arabian Peninsula. It is one of the most important"
                        + "\nagricultural areas in the and the largestKingdom Intertainment Elements\n"
                        + "\nPark Area: 100000.00 SQM\n"
                        + "\nIntertainment Elements:\n"
                        + "Track - Sports - Sitting places - Entertainment - Restaurants "
                        + "- Trips - Kids area - Education\n "
                        + "\nAddress\n"
                        + "King Faisal Road, Petromin, Tabuk, Saudi Arabia\n");
                
                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println();
                
                System.out.println("3.Prince Fahd Bin Sultan Marine Park\nPreview\n"
                        + "An outlet for parents Directly overlooking the sea,\n"
                        + "it includes water channels, green and sandy areas\n,"
                        + "walkways, a youth section and a family section. It\n"
                        + "has several sea views, a two-story restaurant and a\n"
                        + "maritime museum.\n"
                        + "\nPark Area: 97500.00 SQM\n"
                        + "\nIntertainment Elements:\n"
                        + "Track - Sports - Sitting places - Entertainment - Restaurants "
                        + "- Trips - Kids area\n "
                        + "\nAddress\n"
                        + "Al-Sabkha neighborhood, Haql, Tabuk, Saudi Arabia\n");
                
                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println();
                
                System.out.println("4.Palm Park In Haql\nPreview\n"
                        + "\nA forum for lovers of natural beauty The beautiful palm tree"
                        + "\npark which is full of people and enjoys very good patronage "
                        + "\nof water courses, waterfalls, children's recreational games, "
                        + "\nand all kinds of water bridges."
                        + "\nPark Area: 88500.00 SQM\n"
                        + "\nIntertainment Elements:\n"
                        + "Track - Sports - Sitting places - Entertainment - Restaurants "
                        + "- Trips - Kids area\n "
                        + "\nAddress\n"
                        + "King Abdulaziz Street, Haql, Duba, Saudi Arabia\n");
                break;

            case 3:
                System.out.println("1.Al-Qaryah Al-Turathia\n"
                        + "If you would like to enjoy Tabuk for its local delicacies, "
                        + "\nthen this restaurant is for you. The establishment offers "
                        + "\ntraditional Saudi cuisine serving dishes such as kabsa, mandi,"
                        + "\nand madhbi. The vernacular design of the exterior and interior"
                        + "\npairs nicely with the food. ");
                
                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println();
                
                System.out.println("2.Don cafe\n"
                        + "\nDon Cafe is one of the best-rated cafes in Tabuk. Grab a cup of coffee and "
                        + "\nenjoy their calm interiors or outdoor seating. This cafe has a wide range "
                        + "\nof coffee and desserts on their menu, so there's something for everyone.");
                
                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println();
                
                System.out.println("3.Miss Danah Café & Lounge\n"
                        + "\nAn elegant little cafe in Tabuk, Miss Danah Café and Lounge's menu is a combination"
                        + "\nof international dishes, delightful desserts, and refreshing beverages. Their apple "
                        + "\npie is a crowd favorite and must-try.");
                
                System.out.println();
                System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
                System.out.println();
                
                System.out.println("4.Fares’ Steakhouse\n"
                        + "\nRight off Prince Sultan Road is a Turkish Steakhouse with a Saudi flair. Fares’ steakhouse "
                        + "\nis a good place to order for families and groups to enjoy steaks, cooked precisely to your "
                        + "\nliking. We recommend the Steaks on Stakes, a handful of small, incredibly tender wagyu cubes"
                        + "\non a wooden skewer ");
                break;

        }
    }
}
