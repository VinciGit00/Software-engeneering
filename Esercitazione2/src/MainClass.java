
public class MainClass {
	public static void main(String[] args) {
		System.out.println("Hello Pippo!");
		
		double c = Operazioni.Sum(2,4);
		System.out.print("Somma = "+c);
		
		double d = Operazioni.Sub(4,-2);
		System.out.println("Differenza = "+d);
		
		double e = Operazioni.Mul(2, 3);
		System.out.println("Prodotto = "+d);

		double f = Operazioni.Div(2, 4);
		System.out.println("Divisione = "+d);

	}
}   
