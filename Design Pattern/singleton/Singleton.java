package singleton;

public class Singleton {
	private static Singleton theInstance;//l'unica istanza della classe
	
	//Il costruttore e' privato e non puo' essere chiamato dall'esterno della classe
	
	//Viene chiamato solo dal metodo getInstance()
	/*COSTRUTTORE*/
	private Singleton(){
		System.out.println("Costruisco l'oggetto Singleton");
	}

	//Permette di accedere all'unica istanza della classe
	//La prima volta che viene invocato inizializza l'istanza 
	
	/*Creazione del metodo simpleton*/
	public static Singleton getInstance() {
		if (theInstance == null)
			theInstance = new Singleton();
		return theInstance;
	}
}