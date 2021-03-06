package Meldia.Alegla.Pokedex.models;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Evolution implements Serializable{    
    
    private static final long serialVersionUID = 1L;
	//OBJETO DE ESPECIES   
    private EvolutionChain evolution_chain;

    public Evolution(EvolutionChain evolution_chain) {
        this.evolution_chain = evolution_chain;
    }    

    public Evolution() {
    }

    public EvolutionChain getEvolution_chain() {
        return evolution_chain;
    }

    public void setEvolution_chain(EvolutionChain evolution_chain) {
        this.evolution_chain = evolution_chain;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{evolution_chain=").append(evolution_chain);
        sb.append('}');
        return sb.toString();
    }

  
    
    
    
    
}
