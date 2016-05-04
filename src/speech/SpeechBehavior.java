package speech;

import creature.Creature;

public interface SpeechBehavior {
	public void Speak(Creature c);
	
	public void ChangeCatchphrase(Creature c, String s);
}
