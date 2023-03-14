package Day2;

public class Main {
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1");
        stampaRettangolo(r1);
        System.out.println("Rettangolo 2");
        stampaRettangolo(r2);
        System.out.println("Somma delle aree: " + (r1.calcolaArea() + r2.calcolaArea()));
        System.out.println("Somma dei perimetri: " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
    }

    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 10);
        Rettangolo r2 = new Rettangolo(8, 12);
        stampaDueRettangoli(r1, r2);
    }
}
