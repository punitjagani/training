import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AlbumReflection {
	public static void main(String[] args) throws Exception {
//		Album sanju = new Album("Sanju", "Pritam");
//		System.out.println(sanju);
//		
//		Class cls = sanju.getClass();
//		System.out.println(cls);
//		System.out.println(cls.getSuperclass());
		
		//loads class manually
		Class cls = Class.forName("Album");
		
		//Instantiating Album class using reflection
		Object obj = cls.newInstance(); //with default constructor
		System.out.println(obj); //toString() called
		
		Method printMethod = cls.getDeclaredMethod("print", null);
		//to invoke private method
		printMethod.setAccessible(true); //breaking oops concept of encapsulation so by simply making the method private we cannot say 
		//the code is secure
		printMethod.invoke(obj, null);
		
		Constructor[] constructors = cls.getConstructors();
		System.out.println("-- List of Constructors of " +cls);
		for (Constructor c : constructors)
		System.out.println(c);
		
		Method[] methods = cls.getMethods();
		System.out.println("--List of Methods of " +cls);
		for(Method m : methods)
		System.out.println(m);
	
		Method[] decMethods = cls.getDeclaredMethods();
		System.out.println("--List of declared methods of " +cls);
		for (Method m : decMethods) {
		System.out.println(m);
		}
	
		Field[] fields = cls.getDeclaredFields();
	System.out.println("--List of Fields of " +cls);
	for (Field f: fields) {
		System.out.println(f);
		
	}
		
	}

}
