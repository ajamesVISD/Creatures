import java.util.*;

import creature.Creature;
import creature.*;

public class App {
	private static ArrayList<Creature> menagerie;
	
	public static void main(String[] args) {
		
		menagerie = new ArrayList<Creature>();
		
		menagerie.add(new Duck());
		menagerie.add(new Eagle());
		
		for (Creature c: menagerie) {
			c.performFly(3);
			c.performFly(3);
			c.performFly(3);
			c.performSpeech();
			c.changeCatchphrase("I have a new catchprhase now!");
			c.performSpeech();
			System.out.println("");
			}
		}
	}

