package Assignment;

public class Average {

	public static void main(String[] args) {
		
		int x[]= {67,87,93,56,76};
		int sum=0;
		
		for(int i=0;i<x.length;i++) {
			sum+=x[i];
		}
		
		System.out.println("Average Mark of Student in 5 Subjects:"+sum/5);

	}

}
