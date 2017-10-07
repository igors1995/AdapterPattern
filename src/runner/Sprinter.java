package runner;

public class Sprinter implements Runner {
	int distance;

	public Sprinter(int distance) {
		this.distance = distance;
	}

	@Override
	public void run() {
		System.out.println("I can run " + this.distance);
	}

}
