import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Prodejce prodejce1 = new Prodejce();
        Prodejce prodejce2 = new Prodejce();

        prodejce1.setJmeno("Ladislav Mrkvička");
        prodejce1.setDatumNarozeni(LocalDate.of(1939,2,2));
        prodejce1.setPocetSmluv(30260);
        prodejce1.setProdaneMnozstvi(1256891.35);
        prodejce1.setSenior(true);
        prodejce2.setJmeno("Vladimír Kořen");
        prodejce2.setDatumNarozeni(LocalDate.of(1973,12,31));
        prodejce2.setPocetSmluv(5852);
        prodejce2.setProdaneMnozstvi(753210.92);
        prodejce2.setSenior(false);

        System.out.println("Seznam akreditovaných prodejců biomrkve:");
        System.out.println("1. " + prodejce1.getJmeno());
        System.out.println("2. " + prodejce2.getJmeno());

    }
}