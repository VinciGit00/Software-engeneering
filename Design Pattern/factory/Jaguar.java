package factory;

//Subclass
public class Jaguar extends Car{
	String name;
	
	@Override
	public String getName() {
		return this.name+"-Jaguar";
	}
}
