package singleton;


//esempio di utilizzo di singleton

class Company {
	private static Company theCompany;
	private String name;

	/*Creazione deln costruttore privato*/
	private Company() {
		name = "abcCompany";
	}

	/*Serve per la creazione del file una sola volta*/
	public static Company getInstance() {
		if (theCompany == null)
			theCompany = new Company();
		return theCompany;
	}

	public String getName() {
		return name;
	}
}

public class SingletonExample {

	public static void main(String[] args) {
		Company cp = Company.getInstance();
		System.out.println(cp.getName());
	}
}