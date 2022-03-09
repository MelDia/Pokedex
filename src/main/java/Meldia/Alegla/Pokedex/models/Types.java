package Meldia.Alegla.Pokedex.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Types {

	private Type type;
	
	public Types() {}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "type{ " + type + "}";
	}
	
	
}
