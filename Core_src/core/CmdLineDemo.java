package core;
import static java.lang.Math.*;
import static java.lang.System.out;

public class CmdLineDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i<args.length; i++) {
			 sum += Integer.parseInt(args[i]);
		}
	    out.println("sum: " +sum); //bcoz of import lang.System.out
		
	    int x = 10;
	    
	    Integer xObj=x; //Autoboxing
	    
	    out.println(x * xObj); //Autoboxing
	    out.println(PI);
	    out.println(sqrt(25));
	}
	 

}
