package src.Handel;

public class Gegenstände extends Waren {

  private int stückpreis;
  private int anzahl;

  public Gegenstände(int stückpreis, int anzahl) {
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
    ausgabe = "Wert der Gegenstände ist $ " + berechneWert() + ".";
    System.out.println(ausgabe);
  }
}
