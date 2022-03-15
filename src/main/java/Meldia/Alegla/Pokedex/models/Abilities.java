package Meldia.Alegla.Pokedex.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Abilities implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Ability ability;

    public Abilities() {
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "ability {" + ability + "}";
    }
    
    
}
