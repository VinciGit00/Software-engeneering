package observer;

import java.util.Observable;




// classe da osservare
// estende la classe Observable da cui eredita i metodi setChanged, addObserver
// e notifyObservers
public class ConcreteObservable extends Observable {
	double number;

	public void setRandom() {
		number = Math.random() * 100;// genera un numero random tra 0 e 100
		setChanged();// segnala che l'istanza e' stata modificata
		notifyObservers(number);// informa gli osservatori del cambiamento di
								// stato tramite la modalità push
	}
}

	