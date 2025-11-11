package week08.chandra.id.ac.umn;

public class Device {
	protected String brand;
	protected String model;
	
	public Device(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public void displayingInfo() {
		System.out.println("Device Info: Brand: " + this.brand + ", Model: " + this.model);	
	}
	
	public interface Connectivity {
		void connectToWiFi(String networkName);
		void disconnectFromWiFi();
	}

	
}

