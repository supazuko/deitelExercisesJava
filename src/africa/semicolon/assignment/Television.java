public class Television{
    //public static void main(String[] args) {

	private boolean isOn;
    	private String brandName;
    	private int currentChannel;
	private int currentVolume;

    public Television (boolean isOn, String brandName, int currentChannel, int currentVolume){
        this.isOn = isOn;
        this.brandName = brandName;
        this.currentChannel = currentChannel;
	this.currentVolume = currentVolume;
    	}

	public void setOn(boolean upNepa){
        	isOn = upNepa;
    	}
	public boolean isOn(){
        	return isOn;
    	}
	
	public void setBrandName(String brandName){
        	this.brandName = brandName;
    	}
	public String getBrandName(){
        	return brandName;
    	}

	public void setCurrentChannel(int currentChannel){
        	if (isOn = true){
		//System.out.println("LG Life is Good");
	    }
        if(currentChannel > 0 || currentChannel <= 100){
                this.currentChannel = currentChannel;
		//System.out.printf("Channel is on %d%n", this.currentChannel);
            }
	if(currentChannel < 0 || currentChannel > 100){
                System.out.println("Alert: Invalid Channel Number");
		}
	}

	public int getCurrentChannel(){
        	return currentChannel;
    	}

	public void increaseChannel(){
        if (isOn = true){
		//System.out.println(currentChannel);
	    }
        if (currentChannel >= 0 && currentChannel < 100){
                this.currentChannel = currentChannel + 1;
		//System.out.printf("Channel is on %d%n", this.currentChannel);
            }
	if (currentChannel == 100){
                System.out.println("cannot exceed maximum channel limit");
           }
	if (isOn = false){
            	//System.out.println("");
	  }
    	}

	public void decreaseChannel(){
        if (isOn = true){
		//System.out.println(currentChannel);
	    }
        if (currentChannel >= 0 && currentChannel < 100){
                this.currentChannel = currentChannel - 1;
		//System.out.printf("Channel is on %d%n", this.currentChannel);
            }
	if (currentChannel == 0){
                System.out.println("cannot exceed minimum channel limit");
           }
	if (isOn = false){
            	//System.out.println("");
	  }
	}
	public void setCurrentVolume(int currentVolume){
        	if (isOn = true){
	    }
      	}

	public void increaseVolume(){
        if (isOn = true){
		//System.out.println(currentVolume);
	    }
        if (currentVolume >= 0 && currentVolume < 100){
                this.currentVolume = currentVolume + 1;
		//System.out.printf("Volume is %d%n", this.currentVolume);
            }
	if (currentVolume == 100){
                System.out.println("Maximum Volume");
           }
    	}

	public void decreaseVolume(){
        if (isOn = true){
		//System.out.println(currentVolume);
	    }
        if (currentVolume >= 0 && currentVolume < 100){
                this.currentVolume = currentVolume - 1;
		//System.out.printf("Volume is %d%n", this.currentVolume);
            }
	if (currentVolume == 0){
                System.out.println("Minimum Volume");
           }
	}
	public int getVolume(){
        	return currentVolume;
    		}
    		 	
}
