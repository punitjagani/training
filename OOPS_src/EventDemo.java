interface Event{
	void doSomething();
}
public class EventDemo implements Event {

	@Override
	public void doSomething() {
		System.out.println("Class Level implementation");
	}
	
	private static class InnerEventImpl implements Event{
		@Override
		public void doSomething() {
			System.out.println("Inner class Implementation");
		}
	}
	public void anotherImpl() {
		class MethodLevelImpl implements Event{

			@Override
			public void doSomething() {
				System.out.println("Method level Implementation");
			}
		}
		Event e = new MethodLevelImpl();
		e.doSomething();	
	}
	
	public void oneMoreImpl() {
		Event e = new Event() {
			public void doSomething() {
				System.out.println("Anonymous Inner Implementation");
			}
		};
		e.doSomething();
	}
	
	public void oneLastImpl() {
		Event e = () -> System.out.println("Lamda Implementation"); //this line does the same thing that by line 30 to 32
		e.doSomething();
	}
	
	public static void main(String[] args) {
		EventDemo evnt = new EventDemo();
		evnt.doSomething();
		
		//Event innerEvent = evnt.new InnerEventImpl();
		Event innerEvent = new EventDemo.InnerEventImpl();
		innerEvent.doSomething();
		
		evnt.anotherImpl();
		evnt.oneMoreImpl();
		evnt.oneLastImpl();
	}

}
