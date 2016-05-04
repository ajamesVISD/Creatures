import java.util.*;

import creature.Creature;
import creature.Duck;

public class App {
	private static ArrayList<Creature> menagerie;
	
	public static void main(String[] args) {
		
		menagerie = new ArrayList<Creature>();
		
		Creature d = new Duck();
		menagerie.add(d);
		
		for (Creature c: menagerie) {
			for (int i = 0; i < 10; i++) {
				c.performFly();
				c.performSpeech();
				if (i % 2 == 0) {
					c.changeCatchphrase("I am the number " + Integer.toString(i) + " duck!");
				}
			}
		}
	}

}
