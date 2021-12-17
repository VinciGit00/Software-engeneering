package Counter;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CounterTest {

	//Test del costruttore 
	@Test
	public void testCounter() {
		Counter C = new Counter();
	
		int result = C.getValue();
		
		assertEquals(0,result);
	}  
	
	@Test
	public void testInc() {
		Counter C = new Counter();
		assertEquals(0,C.getValue());
	}
	
	@Test
	public void testInc2() {
		Counter C = new Counter();
		C.inc();
		C.inc();
		assertEquals("è sbagliato!!",2,C.getValue());
	}
	
	@Test 
	public void testDec() {
		Counter C = new Counter();
		C.dec();
		C.dec();
		assertEquals(-2, C.getValue());
	}
}
