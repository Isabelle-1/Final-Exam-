package com.example.FinalQuiz.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Books {
	int id;
	String name;
	
	public Books( @JsonProperty("id") int id, @JsonProperty("name") String name) {
        this.name = name;
        this.id = id;
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
