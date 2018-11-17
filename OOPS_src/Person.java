
public class Person implements Cloneable{
	private String name;
	private int age;
	
	public Person() {
		//calling another constructor on the same object with signature
		//constructor calling another constructor can also be called in a hierarchy and is also called constructor chaining
		this("Ananymous",-1);
	}
	
	public Person(String name, int age) {
		// 'this' keyword represents the object in context
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: " + name +"\tAge: " +age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(this.name.equals(p.name) && age == p.age) //here 'this' represents p1 coz in line 46 we are calling on p1 and obj is p2
				return true;
		}
		return false;
	}

	
	
	@Override
	public void finalize() throws Throwable {
		System.out.println("Person is no more");
	}

	public void print() {
		System.out.println("Name: " + name +"\tAge: " +age);
	}
	
	public static void main(String[] args) throws Exception {
		Person p1 = new Person ("Polo", 21);
		System.out.println(p1);
		
		Person pc = (Person) p1.clone();
		System.out.println(pc);
		
		
		
		
		/*Person p = null;
		
		for(int c=1; c<=5; c++)
			p = new Person();
		
		System.gc(); */ //Requesting gc service
//--------------------------------------------------
		/*Person p1=new Person("Polo", 21);
		//p1.print();
		
		Person p2 = new Person("Polo", 21);
		//p2.print();
		System.out.println(p1.hashCode());
		System.out.println(p1); //calls toString() implicitly
		
		System.out.println(p1.equals(p2)); */
	}
}
