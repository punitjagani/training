package core;

public class EmailValidator {
	//1. only 1 occurence of @  and .
	//2. min 4 chars before @
	//3. min 3 chars between @ and .
	//4. min 2 chars after .
	public static void main(String[] args) {
		String email = "zubair@email.c";
		char charac[]=email.toCharArray();
		int countdot=0,countat=0;
		int indexat=email.indexOf('@');
		int indexdot=email.indexOf('.');
		for(int i=0;i<charac.length;i++) {
			if(charac[i]=='@')
				countat++;
			if(charac[i]=='.')
				countdot++;	
		}
		if(indexat>5 && indexdot>(indexat+3) && email.length()>(indexdot+2) && countat==1 && countdot==1)
		{
			System.out.println("Valid email");
		}
		else
		{
			System.out.println("Invalid email");
		}
		
		
		/* Sirs Logic
		 *  int ioat = email.lastindexOf('@');
		   int idat = email.lastindexOf('.');
		   
		   if(ioat==email.lastIndexOf('@') && idat==email.lastIndexOf('.') && ioat>=4 && (ioat-idat)>3 && (email.length()-idot>2)
		    sysout("Valid Email")
		*/
}
}
