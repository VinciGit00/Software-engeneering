package strategy;
public class StandardFormat implements ArrayDisplayFormat {
  public void printData( int[] arr ) {
	  	System.out.print( "{ " );
	  	for(int i=0; i < arr.length-1 ; i++ )
	  			System.out.print( arr[i] + ", " );
	  			System.out.println( arr[arr.length-1] + " }" );
  	}
}
