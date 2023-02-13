package com.example.bestoftheyear.classes;

public class Song {
	private int id;
	private String name;
	
	public Song(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
}
