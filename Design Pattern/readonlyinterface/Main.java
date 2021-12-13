package readonlyinterface;



public class Main {

	//esempio di funzionamento
	public static void main(String[] args) {
		//il mutator crea e modifica un oggetto della classe MutablePerson
		//il riferimento all'oggetto viene conservato nella variabile dell'interfaccia
		ReadOnlyInterface roi = Mutator.createAndUpdate();
		
		//un'istanza della classe UnprivilegedClass legge il valore dell'oggetto
		//tramite l'interfaccia
		UnprivilegedClass uc = new UnprivilegedClass(roi);
		System.out.println("L'oggetto uc della classe UnprivilegedClass ha letto il valore " + uc.readName());
	}
}