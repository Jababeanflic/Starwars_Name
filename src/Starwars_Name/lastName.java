package Starwars_Name;

/**
 * Starwars_Name
 * @author 18025316
 * Scott Kinsmnan
 * 29/09/2020
 * Class lastName handels all variable
 * needed to creat the Starwars last name
 */
public class lastName {

    private static String lName;
    private static String fName;

    /**
     * Constructor
     */
    public lastName(){
        this.setfName(fName);
        this.setlName(lName);
    }

    /**
     * @overload constructor
     * @param fName String first name
     * @param lName String last name
     */
    public lastName(String fName, String lName){
        this.setfName(fName);
        this.setlName(lName);
    }

    /**
     * set first name
     * @param fName String first name
     */
    public void setfName(String fName){ this.fName=fName; }

    /**
     * set last name
     * @param lName string last name
     */
    public void setlName(String lName){
        this.lName=lName;
    }

    /**
     * get first name
     * @return String first name
     */
    public static String getfName() {
        return fName;
    }

    /**
     * get last name
     * @return String last name
     */
    public static String getlName() {
        return lName;
    }
} // end class
