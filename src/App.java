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
			c.performFly(3);
			c.performFly(3);
			c.performFly(3);
			c.performSpeech();
			c.changeCatchphrase("I have a new catchprhase now!");
			}
		}
	}

