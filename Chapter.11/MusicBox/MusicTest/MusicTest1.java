import javax.sound.midi.*;

public class MusicTest1 {
	public void play() {

		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Successfully got a squencer");
		} catch (MidiUnavailableException ex) {
			System.out.println("Bummer");
		}
	}

	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}
}