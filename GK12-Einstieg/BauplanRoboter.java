public class BauplanRoboter {
    // Roboter soll eine Zeichenkette „name“ besitzen
    private String name;
    
    // Wir brauchen eine spezielle Methode, die beim 
    // Bauen, Erstellen eines neuen Roboters ausgeführt
    // mit anderen Worten beim Programmstart
    public BauplanRoboter(String neuerName) {
        System.out.println("Neuer Roboter wird gebaut...");
        // Setze Variable name auf "Wilhelm"
        // name = "Wilhelm";
        
        // Setze die Variable name auf neuerName
        name = neuerName;
    }
    
    public void gibName() {
        System.out.println( name ); 
    }
}
