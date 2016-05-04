package creature;
import flight.*;
import speech.*;

public class Duck extends Creature {
	public Duck() {
		super(new Quacking(), new AwkwardFlight(), 3, "What do a duck know?");
	}
}
