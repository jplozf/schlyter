package schlyter;

public class fmrSolarSystem {
    public static fmrDate date;
    public static fmrSun sun;
    public static fmrMoon moon;
    public static fmrObject mercury;
    public static fmrObject venus;
    public static fmrObject mars;
    public static fmrObject jupiter;
    public static fmrObject saturn;
    public static fmrObject uranus;
    public static fmrObject neptune;

    public fmrSolarSystem() {
        sun = new fmrSun();
        moon = new fmrMoon();
        mercury = new fmrObject("Mercury",48.3313, 3.24587E-5, 7.0047, 5.00E-8, 29.1241, 1.01444E-5, 0.387098, 0, 0.205635, 5.59E-10, 168.6562, 4.0923344368);
        venus = new fmrObject("Venus",76.6799, 2.46590E-5, 3.3946, 2.75E-8, 54.8910, 1.38374E-5, 0.723330, 0, 0.006773, -1.302E-9, 48.0052, 1.6021302244);
        mars = new fmrObject("Mars",49.5574, 2.1101E-5, 1.8497, -1.78E-8, 286.5016, 2.92961E-5, 1.523688, 0, 0.093405, 2.516E-9, 18.6021, 0.5240207766);
        jupiter = new fmrObject("Jupiter",100.4542, 2.76854E-5, 1.3030, -1.557E-7, 273.8777, 1.64505E-5, 5.20256, 0, 0.048498, 4.469E-9, 19.8950, 0.0830853001);
        saturn = new fmrObject("Saturn",113.6634, 2.38980E-5, 2.4886, -1.081E-7, 339.3939, 2.97661E-5, 9.55475, 0, 0.055546, -9.499E-9, 316.9670, 0.0334442282);
        uranus = new fmrObject("Uranus",74.0005, 1.3978E-5, 0.7733, 1.9E-8, 96.6612, 3.0565E-5, 19.18171, -1.55E-8, 0.047318, 7.45E-9, 142.5905, 0.011725806);
        neptune = new fmrObject("Neptune",131.7806, 3.0173E-5, 1.7700, -2.55E-7, 272.8461, -6.027E-6, 30.05826, 3.313E-8, 0.008606, 2.15E-9, 260.2471, 0.005995147);
    }
    
    public fmrSolarSystem(fmrObserver obs)
    {
        this();
        this.setDate(obs.getDate());
        this.setLocation(obs.getLocation());
    }

    public void setDate(fmrDate d) {
        date = d;
        sun.setDate(date);
        moon.setDate(date);
        mercury.setDate(date);
        venus.setDate(date);
        mars.setDate(date);
        jupiter.setDate(date);
        saturn.setDate(date);
        uranus.setDate(date);
        neptune.setDate(date);
    }

    public void setLocation(fmrLocation l) {
        sun.setLocation(l);
        moon.setLocation(l);
        mercury.setLocation(l);
        venus.setLocation(l);
        mars.setLocation(l);
        jupiter.setLocation(l);
        saturn.setLocation(l);
        uranus.setLocation(l);
        neptune.setLocation(l);
    }
}
