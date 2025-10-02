import java.time.LocalDate;

/**
 * Informace o prodejci biomrkve
 */

public class Prodejce {
    private String jmeno;
    private LocalDate datumNarozeni;
    private int pocetSmluv;     // počet dosud sjednaných smluv
    private double prodaneMnozstvi; // celkové množství prodané mrkve v tunách
    private boolean senior; // seniorní prodejce či ne

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public int getPocetSmluv() {
        return pocetSmluv;
    }

    public void setPocetSmluv(int pocetSmluv) {
        this.pocetSmluv = pocetSmluv;
    }

    public double getProdaneMnozstvi() {
        return prodaneMnozstvi;
    }

    public void setProdaneMnozstvi(double prodaneMnozstvi) {
        this.prodaneMnozstvi = prodaneMnozstvi;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }
}
