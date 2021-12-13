package readonlyinterface;

//classe che puo' modificare la classe MutablePerson
public class Mutator {

	//crea una persona (Mario Rossi) e poi gli cambia il nome (Franco Verdi)
	//ritorna il riferimento all'oggetto
	public static MutablePerson createAndUpdate() {
		MutablePerson person = new MutablePerson("Mario", "Rossi");
		System.out.println("Il mutator ha creato la persona " + person.getName());
		person.setName("Franco", "Verdi");
		System.out.println("Il mutator ha modificato il nome in " + person.getName());
		return person;
	}

}