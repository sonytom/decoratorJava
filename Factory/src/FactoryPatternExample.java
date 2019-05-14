
public class FactoryPatternExample {
	
	public static void main(String[] args) throws Exception{
		
		IAnimalFactory animalFactory = new ConcreteFactory();
		IAnimal DuckType = animalFactory.GetAnimalType("Duck");
		DuckType.Speak();
	
		IAnimal TigerType = animalFactory.GetAnimalType("Tiger");
		TigerType.Speak();
	}
	
	

}
