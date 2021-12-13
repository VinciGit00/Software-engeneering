package observer;
import observer.*;

public class ObserverExample {

	public static void main(String[] args) {
		// inizializzazione di due osservatori
				ConcreteObserver observerA = new ConcreteObserver("Alice");
				ConcreteObserver observerB = new ConcreteObserver("Bob");

				// inizializzazione dell'oggetto osservato
				ConcreteObservable observed = new ConcreteObservable();

				// aggiunta degli osservatori all'oggetto da osservare
				observed.addObserver(observerA);
				observed.addObserver(observerB);

				// esempio: si visualizza per tre volte il meccanismo di notifica ed
				// osservazione
				for (int i = 0; i < 3; i++)
					observed.setRandom();
	}

}
