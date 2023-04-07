package tp3;

public class SommeArgent {
	private int quantite;
	private String unite;
	public SommeArgent(int amount,String currency) {
		quantite=amount;
		unite=currency;
	}
	public int getQuantite() {
		return quantite;
	}
	public String getUnit() {
		return unite;
	}
	/*public SommeArgent add(SommeArgent m) {
		return new SommeArgent(getQuantite()+ m.getQuantite(),getUnit());
	}*/
	public SommeArgent add(SommeArgent m) throws UniteDistincteException { 
		if (!m.getUnit().equals(this.getUnit())) { 
		 throw new UniteDistincteException(this, m); 
		 } 
		else return new SommeArgent(getQuantite()+m.getQuantite(), getUnit()); 
		}
	public boolean equale(SommeArgent objet1,SommeArgent objet2) {
		if(objet1==objet2) {
			return true;
		}
		return false;
		
	}
	public boolean equal(SommeArgent objet1) {
		if(getQuantite()==objet1.getQuantite() && getUnit()==objet1.getUnit()) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) throws UniteDistincteException {
		SommeArgent m12CHF= new SommeArgent(12, "CHF"); 
		SommeArgent m14CHF= new SommeArgent(14, "CHF");
		SommeArgent m14USD= new SommeArgent(14, "USD");
		SommeArgent resultat = m12CHF.add(m14CHF);
		      System.out.println(m12CHF.equal(m14CHF));
		System.out.println("la somme est "+ resultat.getQuantite()+resultat.getUnit());
		
		
		Assert.assertTrue(!m12CHF.equals(null));
		Assert.assertEquals(m12CHF, m12CHF);
		Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
		Assert.assertTrue(!m12CHF.equals(m14CHF));
		Assert.assertTrue(!m14USD.equals(m14CHF));

	}

}
