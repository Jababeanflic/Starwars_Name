package Starwars_Name;

/**
 * Starwars_Name
 * @author 18025316
 * Scott Kinsmnan
 * 29/09/2020
 * Class NameGenerator reorginises all
 * user inputs into the new Starwars name
 */
public class NameGenerator {

    /**
     * @return String lname (user last name)
     * reorganised and case changed
     */
    public String starSurname() {
        String lName = lastName.getlName();
        lName = lName.substring(0, 1).toUpperCase() + lName.substring(1, 3).toLowerCase();
        return lName;
    }

    /**
     * @return String fName (user forename)
     * reorganised and case changed
     */
    public String starForename() {
        String fName = lastName.getfName();
        fName = fName.substring(0, 2).toLowerCase();
        return fName;
    }

    /**
     * @return String maidename (user maidename)
     * reorganised and case changed
     */
    public String starMaidenName() {
        String maidenName = firstName.getMaidenName();
        maidenName = maidenName.substring(0, 1).toUpperCase() + maidenName.substring(1, 3).toLowerCase();
        return maidenName;
    }

    /**
     * @return String birthPlace (user birth place)
     * reorganised and case changed
     */
    public String starBirthPlace() {
        String birthPlace = firstName.getBirthPlace();
        birthPlace = birthPlace.substring(0, 3).toLowerCase();
        return birthPlace;
    }

    /**
     * @return String starFname, String starLname
     * combines all regorganised names into final
     * star wars Full Name
     */
    public String generateStarwarsName() {
        String starFname = starSurname() + starForename();
        String starLname = starMaidenName() + starBirthPlace();
        return starFname + " " + starLname;
    }

    /**
     * Print to consol full star wars name
     */
    public void DisplayStarwarsName() {
        System.out.println("Your star wars name is: " + generateStarwarsName());
    }

} // end class
