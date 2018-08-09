package schlyter;

public class Schlyter {

    private static fmrDate zeDate;
    private static fmrLocation zeLocation;
    private static fmrSolarSystem solarSystem;

    //***********************************************************************
    // main()
    //***********************************************************************
    public static void main(String[] args) {
        zeDate = new fmrDate();
        zeLocation = new fmrLocation("Paris", "France", 48.8666687, 2.333333, 42.0);
        solarSystem = new fmrSolarSystem();
        computeObjects();
        showDetailsSun();
        showDetailsMoon();
    }

    //***********************************************************************
    // computeObjects()
    //***********************************************************************
    private static void computeObjects() {
        zeDate = new fmrDate();
        solarSystem.setDate(zeDate);
        solarSystem.setLocation(zeLocation);
    }

    //***********************************************************************
    // showDetailsSun()
    //***********************************************************************
    private static void showDetailsSun() {
        System.out.println("\nSUN ECLIPTIC GEOCENTRIC");
        for (String[] s : solarSystem.sun.getValues(fmrObject.VALUES_GEO_ECLIPTIC)) {
            System.out.format("%s : %s\n", s[0], s[1]);
        }
        System.out.println("\nSUN EQUATORIAL GEOCENTRIC");
        for (String[] s : solarSystem.sun.getValues(fmrObject.VALUES_GEO_EQUATORIAL)) {
            System.out.format("%s : %s\n", s[0], s[1]);
        }
        System.out.println("\nSUN TOPOCENTRIC");
        for (String[] s : solarSystem.sun.getValues(fmrObject.VALUES_TOPO_HORIZONTAL)) {
            System.out.format("%s : %s\n", s[0], s[1]);
        }
    }

    //***********************************************************************
    // showDetailsMoon()
    //***********************************************************************
    private static void showDetailsMoon() {
        System.out.println("\nMOON");
        for (String[] s : solarSystem.moon.getValues(fmrObject.VALUES_ALL)) {
            System.out.format("%s : %s\n", s[0], s[1]);
        }
    }

}
