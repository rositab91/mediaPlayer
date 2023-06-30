package Player;

public class Audio extends MultimediaElement implements Playable {
	private int duration;
	private int volume;

	public Audio(String title, int duration, int volume) {
		super(title);
		this.duration = duration;
		this.volume = volume;
	}

	public int getDuration() {
		return duration;
	}

	public void play() {
		for (int i = 0; i < duration; i++) {
			System.out.println(getTitle() + " " + "!".repeat(volume));
		}
	}

	public void downVolume() {
		if (volume > 0) {
			volume--;
		}
	}

	public void upVolume() {
		volume++;
	}

}