package com.coforge.JenkinsJava;

public class PlayerMain {
	public static void main(String[] args) {
		Player sachin = new Player(10,"Sachin", "Maharashtra");
		System.out.println(sachin.getJerseyNo()+" : "+sachin.getPlayerName()+" : "+sachin.getState());
	}

}
