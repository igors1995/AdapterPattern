package triatlon;

public class TriatlonPlayer implements Triatlon {
	int runDistance;
	int swimDistance;
	int bikeDistance;

	public TriatlonPlayer(int runDistance, int swimDistance, int bikeDistance) {
		super();
		this.runDistance = runDistance;
		this.swimDistance = swimDistance;
		this.bikeDistance = bikeDistance;
	}

	@Override
	public void run() {
		System.out.println("I can run " + this.runDistance);
	}

	@Override
	public void swim() {
		System.out.println("I can swim " + this.swimDistance);
	}

	@Override
	public void rideBike() {
		System.out.println("I can ride bike " + this.bikeDistance);
	}

}
