package Meldia.Alegla.Pokedex.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Type implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Type() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name;
	}
	
	

}
