package flight;

import creature.Creature;

public class AwkwardFlight implements FlightBehavior {

	@Override
	public void Fly(Creature c, int hours) {
		if (c.isTired()) {
			System.out.println("I'm too tired to fly. I'm only a short-distance flyer, you know.");
		} else {
			c.addToHoursFlown(hours);
			System.out.println("I fly awkwardly for " + hours + " hours.");
		}
	}

}
