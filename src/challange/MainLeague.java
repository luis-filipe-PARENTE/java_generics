package challange;

import video_two_three.BaseballPlayer;
import video_two_three.FootballPlayer;
import video_two_three.Team;

public class MainLeague {

	public static void main(String[] args) {
		 
		  League<Team<FootballPlayer>> tableSport = new League<>();
		
		  Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		  
		  Team<FootballPlayer> juventus = new Team<>("Juventus");
		  Team<FootballPlayer> realMarid = new Team<>("Real Marid");
		  Team<FootballPlayer> benfica = new Team<>("Benfica");
		  Team<FootballPlayer> fcPortp = new Team<>("FC Porto");
		  
		  tableSport.addTeamToLeague(adelaideCrows); 
		  tableSport.addTeamToLeague(benfica); 
		  tableSport.addTeamToLeague(fcPortp); 
		  tableSport.addTeamToLeague(juventus); 
		  tableSport.addTeamToLeague(realMarid); 
		  
		  benfica.matchResult(adelaideCrows, 1, 0);
		  adelaideCrows.matchResult(benfica, 0, 1);

		  benfica.matchResult(juventus, 4, 0);
		  juventus.matchResult(benfica, 0, 4);
		  
		  benfica.matchResult(fcPortp, 2, 2);
		  fcPortp.matchResult(benfica, 2, 2);
		  
		  benfica.matchResult(realMarid, 3, 1);
		  realMarid.matchResult(benfica, 1, 3);
		  
		  juventus.matchResult(realMarid, 3, 1);
		  realMarid.matchResult(benfica, 1, 3);
		  
		  System.out.println("--------------------------------------------------------------------------");
		  
		  tableSport.showLeagueTable();
		  
		  Team<BaseballPlayer> HornetsStAntonio = new Team<>("Hornets St. Antonio");
		  // tableSport.addTeamToLeague(HornetsStAntonio);
		  
		  

	}

}
