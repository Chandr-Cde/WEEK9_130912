package week08.chandra.id.ac.umn;

class Car implements Vehicle.Action {
	
	private Vehicle vehicle;
	
	public Car(String name) {
		vehicle = new Vehicle(name);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(vehicle.getName() + "is starting.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(vehicle.getName() + "is stopping.");
	}
	
	public void showVehicleInfo() {
		vehicle.displayInfo();
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("Honda Civic");
		myCar.showVehicleInfo();
		myCar.start();
		myCar.stop();
	}
}

