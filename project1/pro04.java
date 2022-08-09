package project1;

public class pro04 {

	 static void Calc(Cal cal) {
		cal.add(5, 5);
	}
	
	
	public static void main(String[] args) {

		GoodCal cal = new GoodCal();
		System.out.println(cal.add(2, 3));
		System.out.println(cal.subtract(2, 3));
		System.out.println(cal.average(new int[] {1,2,3,}));
		
		badCal bcal = new badCal();
		System.out.println(bcal.add(2, 3));
		System.out.println(bcal.subtract(2, 3));
		System.out.println(bcal.average(new int[] {1,2,3,}));
		
		Cal allCal = new GoodCal();
		System.out.println(allCal.add(2, 3));
		System.out.println(allCal.subtract(2, 3));
		System.out.println(allCal.average(new int[] {1,2,3,}));
		allCal = new badCal();
		System.out.println(allCal.add(2, 3));
		System.out.println(allCal.subtract(2, 3));
		System.out.println(allCal.average(new int[] {1,2,3,}));
		
		Calc(new GoodCal());
		Calc(new badCal());
	}

}
