package challange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import video_two_three.Player;
import video_two_three.Team;

// public class League <U extends Player, T extends Team<U>> {
public class League <T extends Team<?>> {
		
	List<T> teams = null;
	
	public League() {
		this.teams = new ArrayList<>();
	}
	
	public boolean addTeamToLeague(T team) {
		if(this.teams.contains(team)) {
			return false;
		} else {
			this.teams.add(team);
			return true;
		}
	}
			
	public void showLeagueTable() {
		Collections.sort(this.teams);
		this.teams.forEach((team) -> System.out.println(team.getName() + " : " + team.ranking()));
	}
	
}
