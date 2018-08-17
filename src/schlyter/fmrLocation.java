package schlyter;

import java.util.ArrayList;
import java.util.List;
// 20180817
public class fmrLocation {

    public double Latitude;
    public double Longitude;
    public double Elevation;
    public String Name;
    public String Country;

    public static final fmrLocation locations[]
            = {
                new fmrLocation("Aix-en-Provence", "France", 43.5332985, 5.4333301, 73.0),
                new fmrLocation("Amiens", "France", 49.9000015, 2.3, 14.0),
                new fmrLocation("Angers", "France", 47.4667015, -0.55, 12.0),
                new fmrLocation("Annecy", "France", 45.9000015, 6.1166701, 396.0),
                new fmrLocation("Antibes", "France", 43.5833015, 7.1166701, 9.0),
                new fmrLocation("Antony", "France", 48.75, 2.3, 45.0),
                new fmrLocation("Argenteuil", "France", 48.9500008, 2.25, 21.0),
                new fmrLocation("Arles", "France", 43.6666985, 4.6333299, 0.0),
                new fmrLocation("Aubervilliers", "France", 48.9166985, 2.3833301, 33.0),
                new fmrLocation("Aulnay-sous-Bois", "France", 48.9500008, 2.51667, 40.0),
                new fmrLocation("Avignon", "France", 43.9500008, 4.8166699, 10.0),
                new fmrLocation("Beauvais", "France", 49.4333, 2.0833299, 57.0),
                new fmrLocation("Belfort", "France", 47.6333008, 6.8666701, 354.0),
                new fmrLocation("Besançon", "France", 47.25, 6.03333, 235.0),
                new fmrLocation("Béziers", "France", 43.3499985, 3.25, 17.0),
                new fmrLocation("Blois", "France", 47.5833015, 1.33333, 63.0),
                new fmrLocation("Bordeaux", "France", 44.8333015, -0.566667, 0.0),
                new fmrLocation("Boulogne-Billancourt", "France", 48.8333015, 2.25, 0.0),
                new fmrLocation("Bourges", "France", 47.0833015, 2.4000001, 0.0),
                new fmrLocation("Brest", "France", 48.4000015, -4.4833298, 0.0),
                new fmrLocation("Brive-la-Gaillarde", "France", 45.1500015, 1.53333, 0.0),
                new fmrLocation("Caen", "France", 49.1833, -0.35, 0.0),
                new fmrLocation("Calais", "France", 50.9500008, 1.83333, 0.0),
                new fmrLocation("Cannes", "France", 43.5499992, 7.0166702, 0.0),
                new fmrLocation("Chalon-sur-Saône", "France", 46.7832985, 4.8499999, 0.0),
                new fmrLocation("Chambéry", "France", 45.5667, 5.9333301, 0.0),
                new fmrLocation("Champigny-sur-Marne", "France", 48.8167, 2.51667, 0.0),
                new fmrLocation("Charleville-Mézières", "France", 49.7667007, 4.71667, 0.0),
                new fmrLocation("Châteauroux", "France", 46.8167, 1.7, 0.0),
                new fmrLocation("Cholet", "France", 47.0667, -0.883333, 0.0),
                new fmrLocation("Clermont-Ferrand", "France", 45.7832985, 3.0833299, 0.0),
                new fmrLocation("Colmar", "France", 48.0833015, 7.3666701, 0.0),
                new fmrLocation("Colombes", "France", 48.9166985, 2.25, 0.0),
                new fmrLocation("Créteil", "France", 48.7832985, 2.46667, 0.0),
                new fmrLocation("Damgan", "France", 47.517021, -2.605989, 8),
                new fmrLocation("Dijon", "France", 47.3167, 5.0166702, 0.0),
                new fmrLocation("Drancy", "France", 48.9333, 2.45, 0.0),
                new fmrLocation("Dunkerque", "France", 51.0499992, 2.3666699, 0.0),
                new fmrLocation("Epinay-sur-Seine", "France", 48.9500008, 2.3083301, 0.0),
                new fmrLocation("Evreux", "France", 49.0167007, 1.15, 0.0),
                new fmrLocation("Fontenay-sous-Bois", "France", 48.8499985, 2.48333, 0.0),
                new fmrLocation("Grenoble", "France", 45.1666985, 5.71667, 0.0),
                new fmrLocation("Ivry-sur-Seine", "France", 48.8167, 2.3833301, 0.0),
                new fmrLocation("La Rochelle", "France", 46.1666985, -1.15, 0.0),
                new fmrLocation("La Seyne-sur-Mer", "France", 43.0999985, 5.8833299, 0.0),
                new fmrLocation("Laval", "France", 48.0667, -0.766667, 0.0),
                new fmrLocation("Le Havre", "France", 49.5, 0.133333, 0.0),
                new fmrLocation("Le Mans", "France", 48, 0.2, 0.0),
                new fmrLocation("Lille", "France", 50.6333008, 3.0666699, 0.0),
                new fmrLocation("Limoges", "France", 45.8499985, 1.25, 0.0),
                new fmrLocation("Lorient", "France", 47.75, -3.3666699, 0.0),
                new fmrLocation("Lyon", "France", 45.75, 4.8499999, 0.0),
                new fmrLocation("Maisons-Alfort", "France", 48.7999992, 2.4333301, 0.0),
                new fmrLocation("Marseille", "France", 43.2999992, 5.4000001, 0.0),
                new fmrLocation("Mérignac", "France", 44.8333015, -0.633333, 0.0),
                new fmrLocation("Metz", "France", 49.1333008, 6.1666698, 0.0),
                new fmrLocation("Montauban", "France", 44.0167007, 1.35, 0.0),
                new fmrLocation("Montcuq", "France", 44.337632, 1.200401, 215),
                new fmrLocation("Montpellier", "France", 43.5999985, 3.8833301, 0.0),
                new fmrLocation("Montreuil", "France", 48.8666992, 2.4333301, 0.0),
                new fmrLocation("Mulhouse", "France", 47.75, 7.3333302, 0.0),
                new fmrLocation("Nancy", "France", 48.6833, 6.1999998, 0.0),
                new fmrLocation("Nanterre", "France", 48.9000015, 2.2, 0.0),
                new fmrLocation("Nantes", "France", 47.2167015, -1.55, 0.0),
                new fmrLocation("Neuilly-sur-Seine", "France", 48.8833008, 2.26667, 0.0),
                new fmrLocation("Nice", "France", 43.7000008, 7.25, 0.0),
                new fmrLocation("Nîmes", "France", 43.8333015, 4.3499999, 0.0),
                new fmrLocation("Niort", "France", 46.3167, -0.466667, 0.0),
                new fmrLocation("Noisy-le-Grand", "France", 48.8499985, 2.5666699, 0.0),
                new fmrLocation("Orléans", "France", 47.9166985, 1.9, 0.0),
                new fmrLocation("Ozoir-la-Ferrière", "France", 48.778889, 2.685242, 115),
                new fmrLocation("Paris", "France", 48.8666687, 2.333333, 42),
                new fmrLocation("Pau", "France", 43.2999992, -0.366667, 0.0),
                new fmrLocation("Perpignan", "France", 42.6833, 2.8833301, 0.0),
                new fmrLocation("Pessac", "France", 44.7999992, -0.616667, 0.0),
                new fmrLocation("Poitiers", "France", 46.5833015, 0.333333, 0.0),
                new fmrLocation("Quimper", "France", 48, -4.0999999, 0.0),
                new fmrLocation("Reims", "France", 49.25, 4.03333, 0.0),
                new fmrLocation("Rennes", "France", 48.0833015, -1.6833301, 0.0),
                new fmrLocation("Roubaix", "France", 50.7000008, 3.1666701, 0.0),
                new fmrLocation("Rouen", "France", 49.4333, 1.08333, 0.0),
                new fmrLocation("Rueil-Malmaison", "France", 48.8833008, 2.2, 0.0),
                new fmrLocation("Saint-Denis", "France", 48.9333, 2.35833, 0.0),
                new fmrLocation("Saint-Etienne", "France", 45.4333, 4.4000001, 0.0),
                new fmrLocation("Saint-Maur-des-Fossés", "France", 48.7999992, 2.5, 0.0),
                new fmrLocation("Saint-Nazaire", "France", 47.2832985, -2.2, 0.0),
                new fmrLocation("Saint-Quentin", "France", 49.8499985, 3.28333, 0.0),
                new fmrLocation("Sarcelles", "France", 49, 2.3833301, 0.0),
                new fmrLocation("Sartrouville", "France", 48.9500008, 2.1833301, 0.0),
                new fmrLocation("Strasbourg", "France", 48.5833015, 7.75, 0.0),
                new fmrLocation("Toulon", "France", 43.1166992, 5.9333301, 0.0),
                new fmrLocation("Toulouse", "France", 43.5999985, 1.4333301, 0.0),
                new fmrLocation("Tourcoing", "France", 50.7167015, 3.1500001, 0.0),
                new fmrLocation("Tours", "France", 47.3833008, 0.683333, 0.0),
                new fmrLocation("Troyes", "France", 48.2999992, 4.0833302, 0.0),
                new fmrLocation("Valence", "France", 44.9333, 4.9000001, 0.0),
                new fmrLocation("Vénissieux", "France", 45.6833, 4.8833299, 0.0),
                new fmrLocation("Versailles", "France", 48.7999992, 2.1333301, 0.0),
                new fmrLocation("Villeneuve-d\'Ascq", "France", 50.6833, 3.14167, 0.0),
                new fmrLocation("Villeurbanne", "France", 45.7667007, 4.8833299, 0.0),
                new fmrLocation("Vitry-sur-Seine", "France", 48.7832985, 2.4000001, 0.0),
                new fmrLocation("Test-Schlyter", "Scandinavia", 60.00, 15.00, 0.0)
            };

    public fmrLocation(String Name, String Country, double Latitude, double Longitude, double Elevation) {
        this.Name = Name;
        this.Country = Country;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Elevation = Elevation;
    }

    public fmrLocation(String Name, String Country, double Latitude, double Longitude) {
        this.Name = Name;
        this.Country = Country;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Elevation = 0.0;
    }

    public fmrLocation(double Latitude, double Longitude) {
        this.Name = "N/A";
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Elevation = 0.0;
    }

    @Override
    public String toString() {
        return this.Name + ", " + this.Country + " @ " + fmrDate.dd2dms(this.Latitude) + " / " + fmrDate.dd2dms(this.Longitude) + " / " + Double.toString(this.Elevation) + " m";
    }
    
    public static List<fmrLocation> findStartWith(String pattern) {
        List<fmrLocation> rLoc = new ArrayList<>();
        for (fmrLocation loc: locations) {
            if (loc.Name.matches("(?i:^" + pattern + ".*)"))
            {
                rLoc.add(loc);
                System.out.println(loc.toString());
            }
        }
        return rLoc;
    }

    public static List<fmrLocation> findInside(String pattern) {
        List<fmrLocation> rLoc = new ArrayList<>();
        for (fmrLocation loc: locations) {
            if (loc.Name.matches("(?i:.*" + pattern + ".*)"))
            {
                rLoc.add(loc);
                System.out.println(loc.toString());
            }
        }
        return rLoc;
    }
}
