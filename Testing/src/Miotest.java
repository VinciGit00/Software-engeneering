import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Classe che contiene tutti i test
//Il fatto che si chiami test è solo una convenzione 

public class Miotest {

	//Ogni metodo è un caso di test
	
	// Mio test -> chiamo dei metodi e faccio delle operazioni 
	//senza input manuale per automatizzarlo
	//Il controllo non lo faccio a mano ma automatizzato
	//Controlli -> costrutto assert
	@Test
	
	public void test1() {
		int result = 2*2;
		assertEquals(4,result); //Primo valore expected, secondo valore quello ottenuto
	}
	
	
	
}



