package Starwars_Name;

import java.util.Scanner;

/**
 * Starwars_Name
 * @author 18025316
 * Scott Kinsmnan
 * 29/09/2020
 * Class Menu displays menu in consol to gather user info
 * instantiates and pass data to all other classes
 */
public class Menu {
    Scanner kboard = new Scanner(System.in);

    String fName;
    String lName;
    String maidenName;
    String birthPlace;

    /**
     * Requests and stores user info via console
     * instantiates firstName, lastName and NameGenerator classes
     */
    public Menu(){
        System.out.println("Lets get your STAR WARS name");
        System.out.println("What is your first name?");
        fName = kboard.nextLine();
        System.out.println("What is your last name?");
        lName = kboard.nextLine();
        System.out.println("Whats your mother's maiden name?");
        maidenName = kboard.nextLine();
        System.out.println("Where were you born?");
        birthPlace = kboard.nextLine();


        lastName lastName = new lastName(lName,fName); // example using constructor overload
        firstName firstName = new firstName();

        //lastName.setlName(lName);                    // using standard constructor
        //lastName.setfName(fName);
        firstName.setMaidenName(maidenName);
        firstName.setBirthPlace(birthPlace);

        NameGenerator gen = new NameGenerator();
        gen.DisplayStarwarsName();
    }
} // end class

