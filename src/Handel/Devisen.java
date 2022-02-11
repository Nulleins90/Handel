package src.Handel;

public class Devisen extends Waren {
    private int anzahl;
    private int wechselkurs;

    @Override
    public int berechneWert() {
        int wert = 0;
        wert = this.anzahl * this.wechselkurs;
        return wert;
    }

    @Override
    public void wertAusgabe() {
        String ausgabe;
        ausgabe = "Wert der Devisen ist $ " + berechneWert() + ".";
        System.out.println(ausgabe);
    }    
    
}
