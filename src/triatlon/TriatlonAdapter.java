package triatlon;

import runner.Runner;

public class TriatlonAdapter implements Runner {
	Triatlon triatlon;

	public TriatlonAdapter(Triatlon triatlon) {
		this.triatlon = triatlon;
	}

	@Override
	public void run() {
		triatlon.run();
	}

}
