public class AirConditionerClass {
    //public static void main(String[] args) {

	private boolean isOn;
    	private String productName;
    	private int temperature;

    public AirConditionerClass (boolean isOn, String productName, int temperature){
        this.isOn = isOn;
        this.productName = productName;
        this.temperature = temperature;
    }

   public void decreaseTemperature(){
        if (isOn = true){
		System.out.println("Light dey");
	    }
        if (temperature >= 17 || temperature <= 30){
                this.temperature = temperature - 1;
		System.out.printf("Temperature is now %d%n", this.temperature);
            }
	if (temperature == 16){
                System.out.println("cannot exceed minimum temperature limit");
        }
	if (isOn = false){
            	System.out.println("Light no dey");
	  }
    }

    public String getProductName(){
        return productName;
    }

    public int getTemperature(){
        return temperature;
    }

   public void increaseTemperature(){
        if (isOn = true){
		System.out.println("Light dey");
	    }
        if (temperature >= 16 && temperature < 30){
                this.temperature = temperature + 1;
		System.out.printf("Temperature is now %d%n", this.temperature);
            } 
	if (temperature == 30){
                System.out.println("cannot exceed maximum temperature limit");
           }
	if (isOn = false){
            	System.out.println("Light no dey");
	  }
    }

    public boolean isOn(){
        return isOn;
    }

    public void setOn(boolean upNepa){
        isOn = upNepa;
    }

    public void setProductName(String brandName){
        productName = brandName;
    }

    public void setTemperature(int temperature){
        if (isOn = true){
		System.out.println("Light dey");
	    }
        if(temperature >= 16 || temperature <= 30){
                this.temperature = temperature;
		System.out.printf("Temperature is now %d%n", this.temperature);
            }
	if(temperature < 16 || temperature > 30){
                System.out.println("Alert: Temperature cannot be greater than 30 nor less than 16");}
       if (isOn = false){
            	System.out.println("Light no dey");
	  }
    }

}	