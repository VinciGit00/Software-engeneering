package Counter;

public class Counter {
	private int value;
	public Counter(){ value = 0;}
	
	int inc(){return ++value;}
	
	int dec(){return --value;}

	public int getValue() {
		if(value == 0) return value;
		return value;
	}
}
