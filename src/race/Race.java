package race;

import java.util.ArrayList;

import runner.Runner;

public abstract class Race {
	ArrayList<Runner> runners;

	public Race() {
		runners = new ArrayList<>();
	}

	public abstract void addRunner(Runner runner);

	public void startRace() {
		for (Runner runner : runners) {
			runner.run();
		}
	}
}
