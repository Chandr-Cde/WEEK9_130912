package week08.chandra.id.ac.umn;

public class SmartPhone extends Device implements Power, VolumeControl, Device.Connectivity {

	private int currentVolume;
	private String connectedNetwork;

	public SmartPhone(String brand, String model) {
		super(brand, model); 
		this.currentVolume = 50;
		this.connectedNetwork = null;
	}

	public void turnOn() {
		System.out.println("Turning on the device...");
	}

	public void turnOff() {
		System.out.println("Turning off the device...");
	}

	public void increaseVolume(int level) {
		this.currentVolume += level;
		if (this.currentVolume > 100) this.currentVolume = 100;
		System.out.println("Increasing volume by " + level + " levels.");
	}

	public void decreaseVolume(int level) {
		this.currentVolume -= level;
		if (this.currentVolume < 0) this.currentVolume = 0;
		System.out.println("Decreasing volume by " + level + " levels.");
	}

	public void connectToWiFi(String networkName) {
		this.connectedNetwork = networkName;
		System.out.println("Connecting to WiFi: " + this.connectedNetwork);
	}
	
	public void disconnectFromWiFi() {
		if (this.connectedNetwork != null) {
			System.out.println("Disconnecting from WiFi...");
			this.connectedNetwork = null;
		}
	}
}