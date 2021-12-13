package factory;


/*Main del programma*/
public class FactoryExample {

	public static void main(String[] args) {
		
		
		CarFactory factory = new LuxuryCarFabric();
		
		try {
			Car myCar = factory.createCar("Tesla");
			System.out.println(myCar.getName());

			//Sovrascrivo
			myCar = factory.createCar("Jaguar");
			System.out.println(myCar.getName());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
			
		}
	}


