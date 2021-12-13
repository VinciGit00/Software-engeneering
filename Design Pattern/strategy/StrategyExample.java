package strategy;
/*
Si implementa la classe MyArray (Context) che mantiene al suo interno
un array di numeri, gestiti tramite i metodi setValue e getValue. La
particolare modalità di stampa rimane a carico di oggetti che
implementano l’interfaccia ArrayDisplayFormat. Il particolare
l'oggetto che incapsula la procedura di stampa scelta, viene settato
tramite il metodo setDisplayFormat, intanto che la procedura stessa
di stampa viene invocata tramite il metodo display.
*/

public class StrategyExample {

	public static void main(String[] args) {
	
			MyArray m = new MyArray( 10 );
			m.setValue( 1 , 6 );
			m.setValue( 0 , 8 );
			m.setValue( 4 , 1 );
			m.setValue( 9 , 7 );
			System.out.println("This is the array in standard format");
			m.setDisplayFormat( new StandardFormat() );
			m.display();
			System.out.println("This is the array in math format:");
			m.setDisplayFormat( new MathFormat() );
			m.display();
			
	}

}
