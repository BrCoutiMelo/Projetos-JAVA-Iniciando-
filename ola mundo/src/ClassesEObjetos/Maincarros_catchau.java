package ClassesEObjetos;

public class Maincarros_catchau {
	public static void main(String[]args) {
		
		carros_catchau palio1 = new carros_catchau("Palio", "Fiat", 35000, null, false, false, false, false, 0);
		carros_catchau palio2 = new carros_catchau("Palio","Fiat",2,"Prata",false,false,false,false,35000);
		carros_catchau civic = new carros_catchau("Civic","Honda",4,null, true,true,true,true,110000);
	
		System.out.println(civic);
	
	}
}
