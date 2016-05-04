package flight;

import creature.Creature;

public class LongDistanceFlight implements FlightBehavior {

	@Override
	public void Fly(Creature c) {
		if (c.isTired()) {
			System.out.println("I fly far over the mountains.");			
		} else {
			c.addToHoursFlown(10);
			System.out.println("I fly magestically for 10 hours.");
		}
	}
}