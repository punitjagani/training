package core;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50};
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		int[][] jaggu = {{1,2},{3,4,5},{6,7,8,9}};
		
		for (int i=0;i<jaggu.length;i++) {
			for(int j=0;j<jaggu[i].length;j++) {
				System.out.print(jaggu[i][j] + "\t");
			}
		System.out.println();		
		}
		
		String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String[] days = week.split("-");
		
		for (String day : days) {
			System.out.println(day);
		}
	}			
}
