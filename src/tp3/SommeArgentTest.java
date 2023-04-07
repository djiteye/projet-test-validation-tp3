package tp3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tp3.SommeArgent;

public class SommeArgentTest {
	private SommeArgent m12CHF; 
	private SommeArgent m14CHF; 
	private static int nbPasseDansInit = 0; 
	private static int nbPasseDansAfter = 0;
	 @Before 
	public void mesInitialisations() { 
	 m12CHF= new SommeArgent(12, "CHF"); // (1) 
	 m14CHF= new SommeArgent(14, "CHF");
	 System.out.println(++nbPasseDansInit + "ime passage avant exécution d'une méthode de test"); 
	 } 
	 @After 
	 public void apresExecMethTest() { 
	 
	 System.out.println(++nbPasseDansAfter + "ime passage APRES exécution d'une méthode de test");
	 }
	
	@Test
	public void testSommeArgent() {
		SommeArgent m12CHF= new SommeArgent(12, "CHF");
		SommeArgent m14CHF= new SommeArgent(14, "CHF");
		SommeArgent expected = new SommeArgent(26, "CHF");
		SommeArgent m14USD= new SommeArgent(14, "USD");
		
	}
	
	
	@Test
	public void testGetQuantite() {
		/*SommeArgent m = null;
		//testGetQuantite();
		m.getQuantite();*/
	}

	@Test
	public void testGetUnit() {
	/*SommeArgent m=null;
	m.getUnit();*/
	}

	@Test
	public void testAdd() throws UniteDistincteException {
		/*SommeArgent m12CHF= new SommeArgent(12, "CHF"); 
SommeArgent m14CHF= new SommeArgent(14, "CHF");*/
SommeArgent expected = new SommeArgent(26, "CHF");
SommeArgent result = m12CHF.add(m14CHF);
		
	}

	/*@Test
	public void testEquale() {
		fail("Not yet implemented");
		
	}*/

	@Test
	public void testEqual() throws UniteDistincteException {
		
		testSommeArgent();
		/*SommeArgent m12CHF= new SommeArgent(12, "CHF");
		SommeArgent m14CHF= new SommeArgent(14, "CHF");*/
		SommeArgent expected = new SommeArgent(26, "CHF");
		SommeArgent m14USD= new SommeArgent(14, "USD");
		SommeArgent resultat = m12CHF.add(m14CHF);
		Assert.assertTrue(expected.equals(resultat));
		Assert.assertEquals(m12CHF, m12CHF);
		Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
		Assert.assertTrue(!m12CHF.equals(m14CHF));
		Assert.assertTrue(!m14USD.equals(m14CHF));
	}

	/*@Test
	public void testMain() {
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
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
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
	@Test(expected = UniteDistincteException.class) 
	public void leveExceptionPourAddition() throws
	UniteDistincteException { 
	 SommeArgent autreSomme = new SommeArgent(12, "USD"); 
	 m12CHF.add(autreSomme); 
	 }

}
