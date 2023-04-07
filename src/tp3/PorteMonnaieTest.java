package tp3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PorteMonnaieTest {

	/*@Test
	public void testGetContenu() {
		fail("Not yet implemented");
	}

	@Test
	public void testPorteMonnaie() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testAjouteSomme() {
		PorteMonnaie pm = new PorteMonnaie(); 
		 SommeArgent sa1 = new SommeArgent(5, "EUR"); 
		 pm.ajouteSomme(sa1); 
		 System.out.println("le montant du porte monnaie pm est: "+pm); 
		 SommeArgent sa2 = new SommeArgent(5, "EUR"); 
		 pm.ajouteSomme(sa2); 
		 System.out.println("le montant du porte monnaie pm est: "+pm); 
		 PorteMonnaie expected = new PorteMonnaie(); 
		 SommeArgent laSommeTotale = new SommeArgent(10, "EUR"); 
		 
		 expected.ajouteSomme(laSommeTotale); 
		 System.out.println("le montant du porte monnaie expected est: "+expected);
		 
		 Assert.assertTrue(expected.equals(pm)); 
	}

	/*@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject1() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString1() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}*/

}
