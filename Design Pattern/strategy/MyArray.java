package strategy;

public class MyArray {
	private int[] array;
	private int size;
	ArrayDisplayFormat format;
	public MyArray( int size ) {
			array = new int[ size ];
	}
	public void setValue( int pos, int value ) {
			array[pos] = value;
	}
	public int getValue( int pos ) {
		return array[pos];
	}
	public int getLength( int pos ) {
		return array.length;
	}
	public void setDisplayFormat( ArrayDisplayFormat adf ) {
		format = adf;
	}
	public void display() {
		format.printData( array );
}	
}