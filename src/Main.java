import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Prodejce prodejce1 = new Prodejce();
        Prodejce prodejce2 = new Prodejce();

        prodejce1.setJmeno("Ladislav Mrkvička");
        prodejce1.setDatumNarozeni(LocalDate.of(1939,2,2));
        prodejce2.setJmeno("Vladimír Kořen");
        prodejce2.setDatumNarozeni(LocalDate.of(1973,12,31));

        System.out.println("Seznam akreditovaných prodejců biomrkve:");
        System.out.println("1. " + prodejce1.getJmeno() + "; narozen " + prodejce1.getDatumNarozeni());
        System.out.println("2. " + prodejce2.getJmeno() + "; naorzen " + prodejce2.getDatumNarozeni());

    }
}