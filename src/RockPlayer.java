
public class RockPlayer extends Player {

	
	public RockPlayer() {
		super();
	}
	
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
	
	public RockPlayer(String name) {
		super(name);
	}

	
	
}
