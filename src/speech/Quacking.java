package speech;

import creature.Creature;

public class Quacking implements SpeechBehavior {

	public void Speak(Creature c) {
		System.out.println("Quack quack quack, " + c.getCatchphrase());
	}

	@Override
	public void ChangeCatchphrase(Creature c, String s) {
		c.setCatchphrase(s);
	}
}