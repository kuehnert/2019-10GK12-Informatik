public class Autohaus {
    private Auto car1, car2, car3;

    public Autohaus() {
        car1 = new Auto("VW", "LEV DS-155", 75, 10000);
        car2 = new Auto("Jaguar", "K AK-98", 120, 12000);
        car3 = new Auto("Kiwi", "OP A-83", 10, 240000);
    }

    public void druckeSchild(Auto a) {
        System.out.println(
            "Zu verkaufen\nMarke: " +
            a.gibMarke() + ", " +
            "Kennzeichen: " +
            a.gibKennzeichen()
        );
    }

    public void druckeAlleSchilder() {
        druckeSchild(car1);
        druckeSchild(car2);
        druckeSchild(car3);
    }

    public void druckeGesamtpreis() {
        int summe = 0;
        summe = summe + car1.gibPreis();
        summe = summe + car2.gibPreis();
        summe = summe + car3.gibPreis();
        
        System.out.println("Gesamtpreis aller Autos: " + summe);
    }
}
