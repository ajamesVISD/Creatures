package speech;

import creature.Creature;

public class Screeching implements SpeechBehavior {

	@Override
	public void Speak(Creature c) {
		System.out.println("KIEEW! " + c.getCatchphrase());
	}

	@Override
	public void ChangeCatchphrase(Creature c, String s) {
		c.setCatchphrase(s);
	}

}
