package pl.jan.Roz03Dekorator;

public abstract class Napoj {
  String opis = "Napoj nieznany";

  public String pobierzOpis(){
    return opis;
  }

  public abstract double koszt();
}
