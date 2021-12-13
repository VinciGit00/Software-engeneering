package adapter;



//classe che deve essere adattata
class Adaptee {

	public void specificMethod() {
		System.out.println("Metodo specificMethod della classe Adaptee.");
	}
}


//l'interfaccia utilizzata dal cliente
interface Target {
	void method();
}
