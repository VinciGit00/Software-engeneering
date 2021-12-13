package facade;

class A {
	public void methodA() {
		System.out.println("Sono il metodo methodA della classe A.");
	}
}

class B {
	public void methodB() {
		System.out.println("Sono il metodo methodB della classe B.");
	}
}

class C {
	public void methodC() {
		System.out.println("Sono il metodo methodC della classe C.");
	}
}

class Facade {
	private A a;
	private B b;
	private C c;

	Facade() {
		a = new A();
		b = new B();
		c = new C();
	}

	//il metodo facadeMethod raggruppa le chiamate di tutti i metodi necessari all'utente
	public void facadeMethod() {
		a.methodA();
		b.methodB();
		c.methodC();
	}
}

public class FacadePattern {

	//l'utente deve solo chiamare il metodo facadeMethod di Facade
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.facadeMethod();
	}
	
	//senza facade l'utente dovrebbe chiamare tutti i metodi singolarmente
	/*public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.methodA();
		b.methodB();
		c.methodC();
	}*/
	
	
}