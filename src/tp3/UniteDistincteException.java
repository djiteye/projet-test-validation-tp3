package tp3;

public class UniteDistincteException extends Exception {
	private SommeArgent somme1, somme2; 
	 
	public UniteDistincteException(SommeArgent sa1, SommeArgent sa2) { 
	 somme1 = sa1; 
	 somme2 = sa2; 
	 } 
	 
	public String toString() { 
	 return "unité distincte : " + somme1.getUnit() + " != " + 
	somme2.getUnit(); 
	 }

}
