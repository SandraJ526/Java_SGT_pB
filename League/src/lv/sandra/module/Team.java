package lv.sandra.module;

public class Team {
	
	public String name;
	public int wins;
	public int loses;
	public int ties;
	
	public Team (String nameOfTeam) {
		this.name = nameOfTeam;
		this.wins = 0;
		this.loses = 0;
		this.ties = 0;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLoses() {
		return loses;
	}
	public void setLoses(int loses) {
		this.loses = loses;
	}
	public int getTies() {
		return ties;
	}
	public void setTies(int ties) {
		this.ties = ties;
	}
	
	@Override
	public String toString() {
		return "\nTeam [name=" + name + ", wins=" + wins + ", loses=" + loses + ", ties=" + ties + "]";
	}
	
	public int gamesPlayed () {
		return this.wins + this.loses + this.ties;
		
	}
	
	public int countTotalPoints () {
		return this.wins * 2 + this.ties;
		
	}
	
	

}
