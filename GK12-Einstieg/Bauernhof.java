public class Bauernhof {
    private String farmer;
    private Tier tier1;
    private Tier tier2;
    private Tier tier3;

    // Konstruktor
    public Bauernhof() {
        farmer = "MacDieter";
        tier1 = new Tier("Florina", "yellow", "duck", "3", "quack", "3,74m");
        tier2 = new Tier("Günther", "blue", "dog", "15", "woof", "50cm");
        tier3 = new Tier("Sir Galahad", "white", "killer rabbit", "1", "gell", "7km");
    }

    public void singeStrophe(Tier strophenTier) {
        System.out.println(
            "Old " + farmer + " had a farm\n" +
            "E-I E-I O\n" +
            "And on this farm there was a " +
            strophenTier.gibFarbe() + ",\n" +
            strophenTier.gibAlter() + "-year-old " +
            strophenTier.gibArt() + 
            "\nnamed " + strophenTier.gibName() +
            "\nOld " + farmer + " had a farm\n" +
            "E-I E-I O\n"
        );

    }

    public void singeLied() {
        singeStrophe(tier1);
        singeStrophe(tier2);
        singeStrophe(tier3);
    }
}

// 1. Zeilen 24-27: Bauen Sie das echte Geräusch des Tiers ein
// 2. Erweitern Sie das Programm um 2 weitere Tiere
