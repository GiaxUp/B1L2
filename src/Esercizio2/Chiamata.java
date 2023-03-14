package Esercizio2;

public class Chiamata {
	long id;
	long numeroChiamato;
	double durata;

	static long currentId = 0;
	private double costoAlMinuto = 0.1d;

	public Chiamata() {
		this.id = currentId;
		currentId++;
	}

	public Chiamata(long n, double d) {
//		this.id = (long) Math.random() * 1000000000l;
		this.numeroChiamato = n;
		this.durata = d;
	}

	public Chiamata(boolean b) {
		this();
		System.out.println("Inserire il numero chiamato");
		this.numeroChiamato = Runnable.scanner.nextLong();
		System.out.println("Inserire durata chiamata");
		this.durata = Runnable.scanner.nextDouble();
	}

//	Utile per creare una chiamata senza toccare il costruttore
//	static Chiamata creaChiamata() {
//		System.out.println("Inserire il numero chiamato");
//		long numeroChiamato = Runnable.scanner.nextLong();
//		System.out.println("Inserire durata chiamata");
//		double durata = Runnable.scanner.nextDouble();
//		return new Chiamata(numeroChiamato, durata);
//	}

	public double getPrezzo() {
		return costoAlMinuto * durata;
	}
}