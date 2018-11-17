package core;
//to print all prime nums between 2 and 100
public class PrimeNos {
	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {
			int count=0,num=0;
			for (num=i; num>=1;num--) {
				if (i%num==0) {
					count+=1;
				}
			}
			if(count==2){
				System.out.println(i);
			}			
		}
	}
}
