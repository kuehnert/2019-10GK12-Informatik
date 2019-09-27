public class Tier {
    private String name;
    private String farbe;
    private String art;
    private String alter;
    private String laut;
    private String groesse;

    public Tier(String neuerName, String neueFarbe, String neueArt,
    String neuesAlter, String neuerLaut, String neueGroesse) {
        // Weise der Instanzvariable <name> den Wert von 
        // <neuerName> zu
        name = neuerName;
        farbe = neueFarbe;
        art = neueArt;
        alter = neuesAlter;
        laut = neuerLaut;
        groesse = neueGroesse;
    }

    // Funktion gibName()
    // => Druckt den Namen des Tieres auf den Bildschirm
    // => "Gabriel"
    public String gibName() {
        return name;
    }

    public String gibFarbe() {
        return farbe;
    }

    public String gibArt() {
        return art;
    }

    public String gibAlter() {
        return alter;
    }

    public String gibLaut() {
        return laut;
    }

    public String gibGroesse() {
        return groesse;
    }

    // Funktion stellDichVor()
    public void stellDichVor() {
        System.out.println("Hi, I'm " + name + ", the " + farbe + 
        ", " + alter + "-year-old " + art + ". I am " + groesse + "m tall.");
    }
    
    // Lassen Sie auch für alter, laut und groesse freie Werte
    // Und ergänzen Sie stellDichVor()
}