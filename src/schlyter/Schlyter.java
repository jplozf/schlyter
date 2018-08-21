package schlyter;

import java.util.TimeZone;

public class Schlyter {
    private static fmrSolarSystem solarSystem;
    private static fmrObserver obs;

    //***********************************************************************
    // main()
    //***********************************************************************
    public static void main(String[] args) {
        obs = new fmrObserver(
                new fmrDate(1990, 4, 19, 0, 0, 0, TimeZone.getTimeZone("UT")), 
//                new fmrDate(), 
                fmrLocation.findStartWith("test").get(0), 
                "TEST SITE");
        solarSystem = new fmrSolarSystem(obs);
        showDetailsSun();
        showDetailsMoon();
        solarSystem.sun.printAll();
        // solarSystem.moon.printAll();
        // solarSystem.mars.printAll();
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
