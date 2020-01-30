public class Zufallszahlen {
    public void m1() {
        double z = Math.random(); // 0 <= z < 1
        System.out.println("z = " + z);
    }

    public void m2() {
        double z = Math.random(); // 0.0 <= z < 1.0
        z = z * 100; // 0.0 <= z < 100.0
        System.out.println("z = " + z);
    }

    public void m3() {
        double z = Math.random(); // 0.0 <= z < 1.0
        z = z * 100; // 0.0 <= z < 100.0
        int i = (int) z; // Typecasting  0 <= i <= 99
        System.out.println("z = " + z);
    }

    public void m4() {
        double z = Math.random(); // 0.0 <= z < 1.0
        z = z * 100; // 0.0 <= z < 100.0
        int i = (int) z; // Typecasting  0 <= i <= 99
        System.out.println("z = " + z);
    }

    /*
     * Aufgabe:
     * Programmieren Sie einen Magic-8 Ball:
     * Es wird eine zufällige Zahl ermittelt
     * In 40% der Fälle soll ausgegeben werden: "Ja!"
     * In 15%: 'Nein!'
     * In 45%: 'Vielleicht!'
     */
    public void magic8() {
        double x = Math.random();

        if (x < 0.40) {
            System.out.println("Ja!");
        } else if (x < 0.55) {
            System.out.println("Nein!");
        } else { // x < 1.00
            System.out.println("Vielleicht!");
        }
    }
}