package race;

import runner.Runner;

public class BelgradeRun extends Race {
	public BelgradeRun() {
		super();
	}

	@Override
	public void addRunner(Runner runner) {
		runners.add(runner);
	}

}
