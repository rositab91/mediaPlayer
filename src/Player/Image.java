package Player;

public class Image extends MultimediaElement {
	private int brightness;

	public Image(String title, int brightness) {
		super(title);
		this.brightness = brightness;
	}

	public void show() {
		System.out.println(getTitle() + " " + "*".repeat(brightness));
	}

	public void increaseBrightness() {
		brightness++;
	}

	public void decreaseBrightness() {
		if (brightness > 0) {
			brightness--;
		}
	}
}
