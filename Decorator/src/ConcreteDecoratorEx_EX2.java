
public class ConcreteDecoratorEx_EX2 extends AbstractDecorator {
	public void doJob() {
		System.out.println("1");
		System.out.println("2");
		super.doJob();
		System.out.println("decorator2");
		System.out.println("finex2");
		
	}

}
