package immutable;

//un oggetto di questa classe non puo' mai cambiare dopo la creazione
class ImmutableClass {

	private final int x;

	// il costruttore inizializza la variabile x che non puo' piu' essere
	// modificata
	ImmutableClass(int i) {
		x = i;
	}

	// il metodo non modifica il contenuto dell'oggetto
	public String print() {
		return String.valueOf(x);
	}

	// poiche' il metodo non puo' modificare il contenuto dell'oggetto
	// il metodo increment() ritorna un nuovo oggetto con il valore di x
	// incrementato di 1 rispetto all'oggetto corrente
	public ImmutableClass increment() {
		return new ImmutableClass(this.x + 1);
	}
}

// esempio di utilizzo
public class ImmutablePattern {

	public static void main(String[] args) {
		ImmutableClass immutableObj1 = new ImmutableClass(5);
		System.out.println("immutableObj1 prima dell'incremento: " + immutableObj1.print());
		ImmutableClass immutableObj2 = immutableObj1.increment();
		System.out.println("immutableObj1 dopo l'incremento: " + immutableObj1.print());//il contenuto di immutableObj1 non e' cambiato
		System.out.println("immutableObj2: " + immutableObj2.print());//il valore modificato e' quello del nuovo oggetto
	}
}