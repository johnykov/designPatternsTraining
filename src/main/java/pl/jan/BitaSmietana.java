package pl.jan;

public class BitaSmietana extends SkladnikDekorator {

  Napoj napoj;

  public BitaSmietana(Napoj napoj) {
    this.napoj = napoj;
  }

  @Override
  public String pobierzOpis() {
    return napoj.pobierzOpis() + ", Bita Smietana ";
  }

  @Override
  public double koszt() {
    return napoj.koszt() + 0.11;
  }
}
