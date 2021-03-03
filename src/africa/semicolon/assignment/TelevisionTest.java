import java.util.Scanner;
public class TelevisionTest{
    public static void main(String[] args){
	Television remote = new Television(true, "LG", 10, 15);
	Scanner input = new Scanner(System.in);

	remote.setOn(false);
        remote.setBrandName("LG");
        remote.setCurrentChannel(10);
	remote.setCurrentVolume(15);
        remote.decreaseChannel();
        remote.increaseChannel();
	remote.decreaseVolume();
	remote.increaseVolume();

	System.out.println("LG TV is on " + remote.isOn());
	System.out.println(remote.getBrandName() + " Life is Good");
	System.out.println("Volume is on " + remote.getVolume());
	
	//System.out.println("Enter a Channel number: ");	
		//int channel = input.nextInt();
      
        System.out.println("Channel is on " + remote.getCurrentChannel());

	remote.increaseChannel();
	remote.increaseChannel();
	remote.increaseChannel();
	remote.increaseChannel();
	System.out.println("Channel is on " + remote.getCurrentChannel());

	remote.decreaseChannel();
	System.out.println("Channel is on " + remote.getCurrentChannel());

	remote.setCurrentChannel(73);
	System.out.println("Channel is on " + remote.getCurrentChannel());

	remote.decreaseChannel();
	System.out.println("Channel is on " + remote.getCurrentChannel());


	remote.increaseVolume();
	remote.increaseVolume();
	System.out.println("Volume is on " + remote.getVolume());

	remote.increaseVolume();
	System.out.println("Volume is on " + remote.getVolume());

	remote.decreaseVolume();
	remote.decreaseVolume();
	System.out.println("Volume is on " + remote.getVolume());
}
}