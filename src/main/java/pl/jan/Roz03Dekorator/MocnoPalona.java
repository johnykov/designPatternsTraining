package pl.jan.Roz03Dekorator;

public class MocnoPalona extends Napoj {

  public MocnoPalona() {
    opis = "Mocno palona";
  }

  @Override
  public double koszt() {
    return 1.44;
  }
}
