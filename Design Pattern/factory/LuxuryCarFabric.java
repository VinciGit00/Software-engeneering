package factory;


/*ApplSpecifiFactory-> La factory crea gli oggetti*/
public class LuxuryCarFabric implements CarFactory{

	public Car createCar(String type) throws Exception{
		if("TESLA".equalsIgnoreCase(type)) return new Tesla();
		else if("JAGUAR".equalsIgnoreCase(type)) return new Jaguar();			
		else throw new Exception(type + "doesn't exist");
	}
	
}
	


