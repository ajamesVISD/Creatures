import speech.*;
import flight.*;

public class Creature {
	private SpeechBehavior speech;
	
	private FlightBehavior flight;
	
	public Creature() {
		
	}
	
	public void SetSpeechBehavior(SpeechBehavior s) {
		speech = s;
	}
	
	public void SetFlightBehavior(FlightBehavior s) {
		flight = s;
	}
	
	public void Accept() {
		
	};
	
	public void performFly() {
		flight.Fly();
	}
	
	public void performSpeech() {
		speech.Speak();
	}
}
