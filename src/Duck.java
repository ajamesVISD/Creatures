import flight.*;
import speech.*;

public class Duck extends Creature {
	public Duck() {

		SetSpeechBehavior(new Quacking());
		
		SetFlightBehavior(new LongDistanceFlight());
	}
}
