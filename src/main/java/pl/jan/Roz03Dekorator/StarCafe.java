package pl.jan.Roz03Dekorator;

public class StarCafe {

  public static void main(String[] args) {
    Napoj napoj = new Espresso();
    System.out.println(napoj.pobierzOpis() + " " + napoj.koszt() + " zl");

    Napoj napoj1 = new MocnoPalona();
    napoj1 = new Czekolada(napoj1);
    napoj1 = new Czekolada(napoj1);
    napoj1 = new BitaSmietana(napoj1);
    System.out.println(napoj1.pobierzOpis() + " " + napoj1.koszt() + " zl");

    Napoj napoj2 = new StarCafeSpecial();
    napoj2 = new MleczkoSojowe(napoj2);
    napoj2 = new Czekolada(napoj2);
    napoj2 = new BitaSmietana(napoj2);
    System.out.println(napoj2.pobierzOpis() + " " + napoj2.koszt() + " zl");

  }
}
