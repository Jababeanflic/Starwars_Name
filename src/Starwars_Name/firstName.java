package Starwars_Name;

/**
 * Starwars_Name
 * @author 18025316
 * Scott Kinsmnan
 * 29/09/2020
 * Class firstName handels all variable
 * needed to creat the Starwars first name
 */
public class firstName {

    private static String maidenName;
    private static String birthPlace;

    /**
     * Constructor
     */
    public firstName() {
        this.setMaidenName(maidenName);
        this.setBirthPlace(birthPlace);
    }

    /**
     * @overload constructor
     * @param maidenName String maidenName
     * @param birthPlace String birthPlace
     */
    public firstName(String maidenName, String birthPlace){
        this.setMaidenName(maidenName);
        this.setBirthPlace(birthPlace);
    }

    /**
     * Set maidenName
     * @param maidenName String maidenName
     */
    public void setMaidenName(String maidenName){
        this.maidenName=maidenName;
    }

    /**
     * Set birthPlace
     * @param birthPlace String birthPlace
     */
    public void setBirthPlace(String birthPlace){
        this.birthPlace=birthPlace;
    }

    /**
     * @return String maidenName
     */
    public static String getMaidenName() { return maidenName; }

    /**
     * @return String birthPlace
     */
    public static String getBirthPlace() { return birthPlace; }
} // end class
