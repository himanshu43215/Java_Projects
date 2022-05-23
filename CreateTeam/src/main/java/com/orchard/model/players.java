package com.orchard.model;

public class players {

	private Long playerId;
	private String playerName;
	private String teamName;
	private double biddingBudget;
	
	
	public players() {
		super();
		// TODO Auto-generated constructor stub
	}

	public players(Long playerId, String playerName, String teamName, double biddingBudget) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.teamName = teamName;
		this.biddingBudget = biddingBudget;
	}

	public Long getPlayerId() {
		return playerId;
	}
	
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public double getBiddingBudget() {
		return biddingBudget;
	}
	public void setBiddingBudget(double biddingBudget) {
		this.biddingBudget = biddingBudget;
	}
	
	
}
