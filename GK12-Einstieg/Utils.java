public class Utils {     
    public static void test(Object gewuenscht, Object ergebnis) {
        if (gewuenscht.equals(ergebnis)) {
            System.out.print(".");
        } else {
            System.out.print("FEHLER ");
            System.out.print("Erwartet: " + gewuenscht);
            System.out.println(", erhalten: " + ergebnis);
        }
    }
}
