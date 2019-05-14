
public class ConcreteFactory  extends IAnimalFactory{
	@Override
	
	public IAnimal GetAnimalType(String type) throws Exception {
		
		switch (type) {
		case"duck":return new Duck();
		case"tiger": return new Tiger();
		default: throw new Exception("Animal type"+ type+ "cannot be instat");
		
		
		}
	}
	

}
