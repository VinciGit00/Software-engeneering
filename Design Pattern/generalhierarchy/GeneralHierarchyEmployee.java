package generalhierarchy;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
	String firstName;//attributo comune a tutte le sottoclassi
	String lastName;//attributo comune a tutte le sottoclassi
	Manager superior;//superiore dell'impiegato

	Employee(String first, String last, Manager superior) {
		firstName = first;
		lastName = last;
		this.superior = superior;//memorizza il superiore del nodo corrente
		if(superior != null)
			superior.subordinates.add(this);//aggiunge il nodo corrente alla lista dei subordinati del superiore
	}
	
	String printName(){
		return firstName + " " + lastName;
	}
}

//puo' avere subordinati
class Manager extends Employee {
	List<Employee> subordinates;//lista dei subordinati

	Manager(String first, String last, Manager superior) {
		super(first, last, superior);
		subordinates = new ArrayList<Employee>();
	}
}

//non puo' avere subordinati
class NormalEmployee extends Employee {
	
	NormalEmployee(String first, String last, Manager superior) {
		super(first, last, superior);
	}
}


public class GeneralHierarchyEmployee {

	public static void main(String[] args) {
		Manager m1 = new Manager("Marta", "Rossi", null);//non ha superiori
		Manager m2 = new Manager("Fabio", "Verdi", null);//non ha superiori
		Manager m3 = new Manager("Francesca", "Bianchi", m2);//il suo superiore e' m2
		NormalEmployee ne1 = new NormalEmployee("Marco", "Neri", m1);//il suo superiore e' sn1
		NormalEmployee ne2 = new NormalEmployee("Giovanni", "Ferrari", m3);//il suo superiore e' sn3
		NormalEmployee ne3 = new NormalEmployee("Federica", "Brambilla", m1);//il suo superiore e' sn3
		
		//notare che l'istruzione qui sotto non e' permessa
		//l'impiegato normale ne1 non puo' essere capo di nessuno
		//NormalEmployee ne = new NormalEmployee("Federica", "Brambilla", ne1);
		
		System.out.println("Il manager " + m1.printName() + " ha " + m1.subordinates.size() + " subordinati:");
		for(Employee ne: m1.subordinates)
			System.out.println(ne.printName());
		System.out.println("\nIl manager " + m2.printName() + " ha " + m2.subordinates.size() + " subordinati:");
		for(Employee ne: m2.subordinates)
			System.out.println(ne.printName());
		System.out.println("\nIl manager " + m3.printName() + " ha " + m3.subordinates.size() + " subordinati:");
		for(Employee ne: m3.subordinates)
			System.out.println(ne.printName());
		
	}

}
