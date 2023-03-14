package Day2;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public int calcolaArea() {
        return this.altezza * this.larghezza;
    }

    public int calcolaPerimetro() {
        return 2 * (this.altezza + this.larghezza);
    }
}