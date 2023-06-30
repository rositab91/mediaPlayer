package Player;

public class PlayableMedia {
	private Playable item;

	public PlayableMedia(Playable item) {
		this.item = item;
	}

	public void run() {
		if (item instanceof Audio || item instanceof Video) {
			item.play();
		} else if (item instanceof Image) {
			((Image) item).show();
		}
	}
}
