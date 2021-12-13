package delegation;


public class Delegator {

	Delegate delegate = new Delegate();//inizializzazione dell'istanza della classe a cui si delega il lavoro

	//Delega il lavoro al metodo method() della classe Delegate
	public void delegatingMethod() {
		delegate.method();
	}
}

