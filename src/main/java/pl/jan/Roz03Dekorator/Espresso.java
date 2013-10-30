package pl.jan.Roz03Dekorator;

public class Espresso extends Napoj {

  public Espresso() {
    opis = "Kawa Espresso";
  }

  @Override
  public double koszt() {
    return 1.99;
  }
}
