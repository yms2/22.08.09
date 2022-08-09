package project1;

public class AudioRemote implements Remote {

	private int volume;
	
	public void turnOn() {
		System.out.println("오디오를 켭니다.");

	}

	public void turnOff() {
		System.out.println("오디오를 끕니다.");

	}

	public void setVolume(int volume) {
		if(volume>Remote.MAX_VOLUME) {
			this.volume = Remote.MAX_VOLUME;
		}else if (volume<Remote.MIN_VOLUME) {
			this.volume =Remote.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재의 audio 볼륨:" +volume);

	}

}
