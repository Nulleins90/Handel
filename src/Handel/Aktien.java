package src.Handel;

public class Aktien extends Waren {
    private int stückpreis;
    private int anzahl;
    private String name = "Aktien";


    public Aktien(int stückpreis, int anzahl) {
        this.stückpreis = stückpreis;
        this.anzahl = anzahl;
    }

    @Override
    public int berechneWert() {
        int wert = 0;
        wert = stückpreis * anzahl;
        return wert;
    }    

    @Override
    public void wertAusgabe() {
        String ausgabe;
        ausgabe = "Wert der " + name + " ist $" + berechneWert() + ".";
        System.out.println(ausgabe);
    }    

}
