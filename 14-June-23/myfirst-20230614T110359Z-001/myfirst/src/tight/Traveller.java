package tight;

public class Traveller {

	Vehicle vehicle;

	public Traveller() {
		super();
		
	}

	public Traveller(Vehicle vehicle) {
		this.vehicle = vehicle;
		
	}

	public void startJourney() {
		System.out.println("Taveller started journey using " + vehicle );
	}
}
