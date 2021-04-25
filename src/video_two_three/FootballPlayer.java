package video_two_three;

public class FootballPlayer extends Player implements PlayerFifa, Manager{

	public FootballPlayer(String name) {
		super(name);
	}

	@Override
	public Player getPlayersOfTeam() {
		return null;
	}
}
