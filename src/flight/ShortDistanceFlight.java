package flight;

import creature.Creature;

public class ShortDistanceFlight implements FlightBehavior {

	@Override
	public void Fly(Creature c) {
		if (c.isTired()) {
			System.out.println("I'm only a short-distance flyer, you know.");
		} else {
			c.addToHoursFlown(1);
			System.out.println("I fly for one hour.");
		}
	}

}
