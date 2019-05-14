package strategy;

public class CoffeeTest {
	
	
	
	public static void main(String[] args) {
		
		Coffee c1 = new Coffee (new Carioquinha());
		System.out.println(c1.doCoffee());
	
		
		
		Coffee c2 = new Coffee (new Espresso());
		System.out.println(c2.doCoffee());
	}
	

}
