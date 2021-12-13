package readonlyinterface;



//classe non contenuta nel package "a" della classe MutablePerson e che quindi
//puo' accederci solo attraverso l'interfaccia pubblica ReadOnlyInterface
//che permette solo l'esecuzione del metodo getName()
public class UnprivilegedClass {
	ReadOnlyInterface readOnlyInterface;
	
	public UnprivilegedClass(ReadOnlyInterface r){
		readOnlyInterface = r;
	}
	
	public String readName(){
		return readOnlyInterface.getName();
	}
}
