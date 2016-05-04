package speech;

import creature.Creature;

public class Quacking implements SpeechBehavior {

	public void Speak(Creature c) {
		System.out.println("Quack quack quack, " + c.getCatchphrase());
	}

}