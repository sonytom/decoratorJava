
public class DecoratorExemplo {
public static void main(String [] args) {
	
	
	ConcreteComponet cc= new ConcreteComponet();
	ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();
	
	cd_1.setTheComponent(cc);
	cd_1.doJob();
	ConcreteDecoratorEx_EX2 cd_2 = new ConcreteDecoratorEx_EX2();
	cd_2.setTheComponent(cd_1);
	cd_2.doJob();
}
	
	
	
}
