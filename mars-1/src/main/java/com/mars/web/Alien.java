package com.mars.web;

public class Alien {
	private int alienID;
	private String alienName;
	private String alienLang;
	public int getAlienID() {
		return alienID;
	}
	public void setAlienID(int alienID) {
		this.alienID = alienID;
	}
	public String getAlienName() {
		return alienName;
	}
	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}
	public String getAlienLang() {
		return alienLang;
	}
	public void setAlienLang(String alienLang) {
		this.alienLang = alienLang;
	}
	@Override
	public String toString() {
		return "Alien [alienID=" + alienID + ", alienLang=" + alienLang + ", alienName=" + alienName + "]";
	}
	
	

}
