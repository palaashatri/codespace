package com.example.playerproject.model;

public class Player {
	
	private int playerNumber;
	private String playerName;
	private String skill;
	private String country;
	private String mobile;
	
	public Player() {
		super();
	}

	public Player(int playerNumber, String playerName, String skill, String country, String mobile) {
		super();
		this.playerNumber = playerNumber;
		this.playerName = playerName;
		this.skill = skill;
		this.country = country;
		this.mobile = mobile;
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public String getSkill() {
		return skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Player [playerNumber=" + playerNumber + ", playerName=" + playerName + ", skill=" + skill + ", country="
				+ country + ", mobile=" + mobile + "]";
	}
	
}
