package Player;

public class Video extends MultimediaElement {
	private int duration;
	private int volume;
	private int brightness;

	public Video(String title, int duration, int volume, int brightness) {
		super(title);
		this.duration = duration;
		this.volume = volume;
		this.brightness = brightness;
	}

	public int getDuration() {
		return duration;
	}

	public void play() {
		for (int i = 0; i < duration; i++) {
			System.out.println(getTitle() + " " + "!".repeat(volume) + "*".repeat(brightness));
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

	public void upBrightness() {
		brightness++;
	}

	public void downBrightness() {
		if (brightness > 0) {
			brightness--;
		}
	}
}
