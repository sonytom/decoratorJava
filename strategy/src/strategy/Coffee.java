package strategy;

public class Coffee {
	
	private ICoffee coffee;
	
	public Coffee(ICoffee c) {
		
		coffee = c;
		
	}

	
	public String doCoffee() {
		return coffee.doCoffee();
		
	}
	
}
