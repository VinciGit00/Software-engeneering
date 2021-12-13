package readonlyinterface;

//l'interfaccia read only contiene solo i metodi che non modificano i valori della classe MutablePerson
public interface ReadOnlyInterface{
	public String getName();
}

//e' la classe che si vuole proteggere dalla scrittura della classi esterne al package
//la classe implementa i metodi dell'interfaccia ReadOnlyInterface
class MutablePerson implements ReadOnlyInterface{
	private String firstName;
	private String lastName;
	
	MutablePerson(String first, String last){
		setName(first, last);
	}
	
	//visibile solo alle classi del package
	void setName(String first, String last){
		firstName = first;
		lastName = last;
	}
	
	public String getName(){
		return firstName + " " + lastName;
	}
}