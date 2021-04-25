package video_two_three;

public class Main {

	public static void main(String ...args) {
		
	    FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        // adelaideCrows.addPlayer(pat);
        // adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
        
        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago cubs");
        chicagoCubs.addPlayer(pat);
		
	} // Avance de 5 s
}
