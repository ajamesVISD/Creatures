package flight;

import creature.Creature;

public class MajesticFlight implements FlightBehavior {

	@Override
	public void Fly(Creature c, int hours) {
		if (c.isTired()) {
			System.out.println("I fly far over the mountains.");			
		} else {
			c.addToHoursFlown(hours);
			System.out.println("I fly magestically for " + hours + " hours.");
		}
	}
}