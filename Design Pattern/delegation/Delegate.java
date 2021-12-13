package delegation;

public class Delegate {

	//Metodo a cui viene delegato il lavoro dal metodo delegatingMethod() della classe Delegator
	void method() {
		System.out.println("Metodo method della classe Delegate");
	}
	
	//Metodo che non ha rapporti con la classe Delegator
	//Per questo non e' possibile utilizzare l'ereditarieta' tra classi
	void otherMethod(int x){
		System.out.println("Metodo otherMethod della classe Delegate");
	}
}



