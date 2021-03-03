public class MP3Player{
	private String name;
	private boolean isOn;
	private int volume;
	private int currentTrack;
	private boolean isPlaying;
	private boolean isPaused;
	private int totalTracks;

	public MP3Player(String name, int currentTrack, int volume){
		this.name = name;
		this.currentTrack = currentTrack;
		this.volume = volume;
	}

	public boolean isOn(){
		return isOn;
	}

	public void setOn(boolean isOn){
		this.isOn = isOn;
		if (isOn == true){
			isOn = false;
		}
		else {
			isOn = true;
		}
	}

	public int getVolume(){
		if (isOn == true){
			return volume;
		}
		return 0;
	}

	public String getName(){
		if (isOn == true){
			return this.name;
		}
		return "";
	}

	public void increaseVolume(){
		if(isOn == true){
			if (volume  >= 0 && volume < 100);
				volume += 1;
			}
			else
				System.out.println("Maximum Volume Reached");
		}
		
	public void decreaseVolume(){
		if(isOn == true){
			if (volume <= 100 && volume >= 1);
				volume -= 1;
			}
			else
				System.out.println("Minimum Volume Reached");		
		}
	
	public int getCurrentTrack(){
		if (isOn == true){
			return currentTrack;
		}
		return 0;
	}

	public int getTotalTracks() {
		if (isOn == true){
			return totalTracks;
		}
		return 0;
	}

	public void next(){
		if(isOn == true && currentTrack != totalTracks){
			currentTrack += 1;
		}
	}

	public void prev(){
		if(isOn == true && currentTrack != 1 ){
			currentTrack -= 1;
		}
	}
	
	public void pauseOrPlay(){
		if (isOn == true){
			if(isPaused == false){
				isPlaying = true;
			}
			if(isPlaying == true){
				isPaused = false;
			}
		}
	}

	public boolean isPlaying(){
		return isPlaying;
	}
	public boolean isPaused(){
		return isPaused;
	}

}