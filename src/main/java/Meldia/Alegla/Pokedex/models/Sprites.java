package Meldia.Alegla.Pokedex.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Sprites implements Serializable{
    
    
	private static final long serialVersionUID = 1L;
	private String front_default;

    public Sprites() {
    }

    public Sprites(String front_default) {
        this.front_default = front_default;
    }

    public String getFront_default() {
        return front_default;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{front_default=").append(front_default);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
