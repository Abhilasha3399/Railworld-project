package polymorphism;

public class ModifyCar extends car {
	
	@Override
	public void start() {
		System.out.println("automatic start the car");
	}
	@Override
	public void stop() {
		System.out.println("automatic stop the car");
		
	}
	
	public void openroof() {
		System.out.println("open the roof");
	}
	
		
	}


