package creature;
import speech.*;
import flight.*;

public abstract class Creature {
	private SpeechBehavior speech;
	private FlightBehavior flightBehavior;
	
	private int hoursFlown;
	private int maxHoursFlown;
	
	private String catchphrase;
	
	private boolean tired;
	
	/**
	 * 
	 * @param flight -- an instance of a FlightBehavior for the Creature
	 * @param maxHoursFlown -- the maximum number of hours the creature can fly.
	 * @param flightSpeed -- the speed of the creature when flying
	 * @param catchphrase -- the creature's favorite catchphrase.
	 */
	public Creature(SpeechBehavior speech, FlightBehavior flight, int maxHoursFlown, String catchphrase) {
		super();
		SetSpeechBehavior(speech);
		SetFlightBehavior(flight);
		this.maxHoursFlown = maxHoursFlown;
		this.catchphrase = catchphrase;
		this.tired = false;
	}

	public int getHoursFlown() {
		return hoursFlown;
	}

	public void setHoursFlown(int hoursFlown) {
		this.hoursFlown = hoursFlown;
	}

	public int getMaxHoursFlown() {
		return maxHoursFlown;
	}

	public void setMaxHoursFlown(int maxHoursFlown) {
		this.maxHoursFlown = maxHoursFlown;
	}

	public String getCatchphrase() {
		return catchphrase;
	}

	public void setCatchphrase(String catchphrase) {
		this.catchphrase = catchphrase;
	}

	public boolean isTired() {
		return tired;
	}

	public void setTired(boolean tired) {
		this.tired = tired;
	}

	public void SetSpeechBehavior(SpeechBehavior s) {
		speech = s;
	}
	
	public void SetFlightBehavior(FlightBehavior s) {
		flightBehavior = s;
	}
	
	public void Accept() {
		
	};
	
	public void performFly() {
		flightBehavior.Fly(this);
	}
	
	public void addToHoursFlown(int n) {
		hoursFlown += n;
		tired = (hoursFlown > maxHoursFlown);
	}
	
	public void performSpeech() {
		speech.Speak(this);
	}
}
