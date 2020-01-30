public class KontrollStrukturen {
    // Datentyp double für Kommazahl
    
    // 0.5 promille => 5 messwert
    public void pusten(double messwert) {
        if (messwert <= 0.5) {
            System.out.println("Super, Sie dürfen weiterfahren.");
        } else if (messwert <= 0.7) {
            System.out.println("Vorsicht, Du Nase, das kann ins Auge gehen!");
        } else if (messwert <= 0.9) {
            System.out.println("Das gibt 2 Punkte!");
        } else {
            System.out.println("Das gibt 5 Punkte, und der Lappen is fott!");
        }
    }

    public void richtigPusten(double messwert, int vergehen) {
        // https://www.bussgeldkatalog.org/alkohol-drogen/
        
    }
}
