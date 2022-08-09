package project1;

public class TVRemote implements Remote {

	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	public void setVolume(int volume) {
		if(volume>Remote.MAX_VOLUME) {
			this.volume = Remote.MAX_VOLUME;
		}else if (volume<Remote.MIN_VOLUME) {
			this.volume =Remote.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재의 tv볼륨:" +volume);

	}

}
