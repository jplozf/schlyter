package schlyter;
import java.util.TimeZone;

public class Schlyter {

    private static fmrDate zeDate;
    private static fmrLocation zeLocation;
    private static fmrSolarSystem solarSystem;

    //***********************************************************************
    // main()
    //***********************************************************************
    public static void main(String[] args) {
        zeDate = new fmrDate(1990, 4, 19, 0, 0, 0, TimeZone.getTimeZone("UT"));
        zeLocation = fmrLocation.findStartWith("test").get(0);
        solarSystem = new fmrSolarSystem(new fmrObserver(zeDate, zeLocation, "TEST SITE"));
        showDetailsSun();
        showDetailsMoon();
        solarSystem.sun.printAll();
        solarSystem.moon.printAll();
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
