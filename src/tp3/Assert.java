package tp3;

public class Assert {
    
	public static void assertTrue(boolean b) {
		String Result;
		if(b==true) {
			Result="true";
		}else {
		Result="false";
		}
		 System.out.println(Result);
		
	}
	public static void assertEquals(SommeArgent n, SommeArgent m) {
		
		String Result;
		if(n.getQuantite()==m.getQuantite()) {
			Result="true";
			
		}else {
		Result="false";
		}
		 System.out.println(Result);
	}

}
