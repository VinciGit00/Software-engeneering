package adapter;



//classe che adatta la classe Adaptee in base all'interfaccia Target
public class Adapter implements Target {
	Adaptee adaptee;

	public Adapter() {
		adaptee = new Adaptee();
	}

	public void method() {
		adaptee.specificMethod();
	}
}



