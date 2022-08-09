package project1;

public class pro05 {

	public static void main(String[] args) {
		Remote remote;
		
		remote = new TVRemote();
		remote.turnOn();
		remote.setVolume(5);
		remote.turnOff();

		remote = new AudioRemote();
		remote.turnOn();
		remote.setVolume(9);
		remote.turnOff();
		
	}

}
