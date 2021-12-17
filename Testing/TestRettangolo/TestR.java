import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestR {
	@Test
	public void testRettangolo() {
		Rettangolo r = new Rettangolo(2,3);
		
		assertEquals(3, r.getAltezza());
		assertEquals(2, r.getBase());
	}
	
	@Test
	public void testRettangoloNumeriNegativi() {
		try {
			Rettangolo r = new Rettangolo(2,-3);
		
		} catch (Exception E) {
			assertTrue(true);
			return;
			
		}
		fail("Il dec non ha lanciato l'ecezione");
	}

	@Test
	public void testgetBase() {
		Rettangolo r1 = new Rettangolo(2,3);
		int valore = r1.getBase();
		assertEquals(2, valore);
	}
	
	@Test
	public void testgetAltezza() {
		Rettangolo r2 = new Rettangolo(2,3);
		assertEquals(3,r2.getAltezza());
	}
}
