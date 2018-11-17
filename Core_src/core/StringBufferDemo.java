package core;

public class StringBufferDemo {
	public static void main(String[] args) {
		/*	int strlen;
		String str;
	*/
		StringBuffer s1 = new StringBuffer("Hello");
	/*	
		str="world";
	    //comparing references 
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		//comparing variables
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	*/	
		s1.append("World");
		System.out.println(s1);
	
		//strlen=s1.length();
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.subSequence(3,7));
		System.out.println(s1.replace(5, 10, "java"));
	}

}
