package project1;

public class badCal extends Cal {

	public int add(int a, int b) {
		return a+b+100;
	}

	public int subtract(int a, int b) {
		return a-b-100;
	}

	public double average(int[] a) {
		int sum = 0;
		for(int i:a) {
			sum = sum+i;
		}
		return(( sum/a.length)/100);
	}

}
