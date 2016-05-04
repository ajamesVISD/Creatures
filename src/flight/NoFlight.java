package flight;

import creature.Creature;

public class NoFlight implements FlightBehavior {

	@Override
	public void Fly(Creature c) {
		System.out.println("I cannot fly. " + c.getCatchphrase());
	}

}
