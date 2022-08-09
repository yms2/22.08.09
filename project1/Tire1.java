package project1;

public class Tire1 extends Tire{
	public Tire1(String location, int maxRotation) {
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
