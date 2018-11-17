package core;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Hello"; //Primitive style
		String s2 = new String("Hello"); //Object style
		String s3 = "Hello";
		
		//comparing references 
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		//comparing variables
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		s1 = s1 + "World";
		System.out.println(s1);
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));
		System.out.println(s1.replace('o','u'));
	}

}
