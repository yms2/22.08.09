package project1;

public class Tire2 extends Tire {
	//생성자
	public Tire2(String location, int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {
		++accumalatedRoation;
		if(accumalatedRoation<maxRotation) {
			System.out.println(location+"Tire 수명:"+(maxRotation-accumalatedRoation));
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크 ***");
			return false;
		}
	}
	
}
