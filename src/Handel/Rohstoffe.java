package src.Handel;

public class Rohstoffe extends Waren {
    private int einheit;
    private int wertProEinheit;

    public Rohstoffe(int einheit, int wertProEinheit) {
        this.einheit = einheit;
        this.wertProEinheit = wertProEinheit;
    }

    @Override
    public int berechneWert() {
        int wert = 0;
        wert = einheit * wertProEinheit;
        return wert;
    }

    @Override
    public void wertAusgabe() {
        String ausgabe;
        ausgabe = "Wert der Rohstoffe ist $ " + berechneWert() + ".";
        System.out.println(ausgabe);
    }    
}
