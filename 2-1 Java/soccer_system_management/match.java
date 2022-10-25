package soccermanagementsystem;

public class match {
	private String home_team;
	private String homenumberofgoals;
	private String away_team;
	private String awaynumberofgoals;
	private String referee1id;
	private String referee2id;
	private String referee3id;
	private String stadiumid;

	public match(String home_team, String homenumberofgoals, String away_team, String awaynumberofgoals,
			String referee1id, String referee2id, String referee3id, String stadiumid) {
		this.home_team = home_team;
		this.homenumberofgoals = homenumberofgoals;
		this.away_team = away_team;
		this.awaynumberofgoals = awaynumberofgoals;
		this.referee1id = referee1id;
		this.referee2id = referee2id;
		this.referee3id = referee3id;
		this.stadiumid = stadiumid;		
	}


	public String getHome_team() {
		return home_team;
	}


	public void setHome_team(String home_team) {
		this.home_team = home_team;
	}


	public String getHomenumberofgoals() {
		return homenumberofgoals;
	}


	public void setHomenumberofgoals(String homenumberofgoals) {
		this.homenumberofgoals = homenumberofgoals;
	}


	public String getAway_team() {
		return away_team;
	}


	public void setAway_team(String away_team) {
		this.away_team = away_team;
	}


	public String getAwaynumberofgoals() {
		return awaynumberofgoals;
	}


	public void setAwaynumberofgoals(String awaynumberofgoals) {
		this.awaynumberofgoals = awaynumberofgoals;
	}


	public String getReferee1id() {
		return referee1id;
	}


	public void setReferee1id(String referee1id) {
		this.referee1id = referee1id;
	}


	public String getReferee2id() {
		return referee2id;
	}


	public void setReferee2id(String referee2id) {
		this.referee2id = referee2id;
	}


	public String getReferee3id() {
		return referee3id;
	}


	public void setReferee3id(String referee3id) {
		this.referee3id = referee3id;
	}


	public String getStadiumid() {
		return stadiumid;
	}


	public void setStadiumid(String stadiumid) {
		this.stadiumid = stadiumid;
	}

}
