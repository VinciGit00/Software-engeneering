package observer;

import java.util.Observable;
import java.util.Observer;



	// classe che osserva
	// implementa l'interfaccia Observer
	// deve definire il metodo update
public	class ConcreteObserver implements Observer {
		String observerName;// nome dell'osservatore
		double localNumber;// copia locale del valore osservato

		public ConcreteObserver(String name) {
			observerName = name;
		}

		public void update(Observable observedObject, Object obj) {
			// si copia localmente il valore di number dell'oggetto osservato
			// observed
			// il valore viene passato da notifyObservers ad update
			localNumber = ((Double) obj).doubleValue();
			System.out.println("Il concrete observer " + observerName
					+ " ha letto il valore " + localNumber);
		}
	}
