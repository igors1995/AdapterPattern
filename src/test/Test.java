package test;

import race.BelgradeRun;
import race.Race;
import runner.Runner;
import runner.Sprinter;
import triatlon.Triatlon;
import triatlon.TriatlonAdapter;
import triatlon.TriatlonPlayer;

public class Test {
	public static void main(String[] args) {
		Race belgradeRace = new BelgradeRun();

		Runner bolt = new Sprinter(20);
		Triatlon nateDiaz = new TriatlonPlayer(15, 5, 100);

		belgradeRace.addRunner(bolt);
		belgradeRace.addRunner(new TriatlonAdapter(nateDiaz));

		belgradeRace.startRace();
	}
}
