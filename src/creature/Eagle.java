package creature;

import flight.MajesticFlight;
import speech.Screeching;

public class Eagle extends Creature {
	public Eagle() {
		super(new Screeching(), new MajesticFlight(), 15, "America, baby!");
	}
}
