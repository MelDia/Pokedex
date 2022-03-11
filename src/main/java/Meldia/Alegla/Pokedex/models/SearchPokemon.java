package Meldia.Alegla.Pokedex.models;

import java.io.Serializable;

public class SearchPokemon implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String id;

	public SearchPokemon() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

		
	
}
