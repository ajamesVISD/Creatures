import java.util.*;

public class App {
	private static ArrayList<Creature> menagerie;
	
	public static void main(String[] args) {
		
		menagerie = new ArrayList<Creature>();
		
		Creature d = new Duck();
		menagerie.add(d);
		
		for (Creature c: menagerie) {
			c.performFly();
			c.performSpeech();
		}
	}

}
