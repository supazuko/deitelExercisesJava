public class MP3PlayerTest{

	public static void main (String[] args){

	MP3Player musicPlayer = new MP3Player("Sony", 5, 20);

	musicPlayer.setOn(true);
	System.out.println(musicPlayer.isOn());
	System.out.println(musicPlayer.getName() + " Walkman in switched on");
	System.out.println("Volume is on " + musicPlayer.getVolume());

	musicPlayer.pauseOrPlay();
	System.out.println(musicPlayer.isPlaying());

	musicPlayer.increaseVolume();
	musicPlayer.increaseVolume();
	musicPlayer.increaseVolume();
	System.out.println("Volume is on " + musicPlayer.getVolume());

	musicPlayer.increaseVolume();
	musicPlayer.increaseVolume();
	System.out.println("Volume is on " + musicPlayer.getVolume());

	musicPlayer.decreaseVolume();
	musicPlayer.decreaseVolume();
	musicPlayer.decreaseVolume();
	System.out.println("Volume is on " + musicPlayer.getVolume());
	musicPlayer.decreaseVolume();
	System.out.println("Volume is on " + musicPlayer.getVolume());

	musicPlayer.pauseOrPlay();
	System.out.println(musicPlayer.isPaused());

	musicPlayer.prev();
	System.out.println("Track number: " + musicPlayer.getCurrentTrack());

	musicPlayer.pauseOrPlay();
	System.out.println(musicPlayer.isPlaying());

	musicPlayer.prev();
	musicPlayer.prev();
	musicPlayer.prev();
	System.out.println("Track number: " + musicPlayer.getCurrentTrack());

	musicPlayer.pauseOrPlay();
	System.out.println(musicPlayer.isPaused());
	System.out.println(musicPlayer.isPlaying());
	System.out.println("Track number " + musicPlayer.getCurrentTrack());

	musicPlayer.next();
	System.out.println("Track number " + musicPlayer.getCurrentTrack());

	musicPlayer.next();
	System.out.println("Track number " + musicPlayer.getCurrentTrack());
	musicPlayer.next();
	musicPlayer.next();
	System.out.println("Track number " + musicPlayer.getCurrentTrack());

	musicPlayer.pauseOrPlay();
	System.out.println(musicPlayer.isPaused());

	}
}