package project1;

public class pro02 {

	public static void main(String[] args) {

		Car car = new Car();
		for(int i =1;i<=5;i++) {
			int problemLocation = car.run ();
			
			switch(problemLocation) {
			case 1:
				System.out.println("왼앞쪽 한국타이어로 교체");
				car.frontLeftTire = new TIre2("앞왼쪽, 15");
				break;
			case 2:
				System.out.println(("앞 오른쪽 금호TIre로 교체"));
				car.frontRightTire = new Tire1("앞오른쪽":,13);
				break;
			case 3:
				System.out.println("뒤왼쪽 g한국타이어로 교체");
				back.backLeftTire = new TIre2("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른 금호타이어로 교체");
				back.backRightTire = new TIre1("뒤오른쪽",14)
			break;
			}
			System.out.println("------------------");
		}
		
	}

}
