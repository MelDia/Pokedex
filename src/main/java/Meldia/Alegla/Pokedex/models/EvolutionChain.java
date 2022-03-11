package Meldia.Alegla.Pokedex.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EvolutionChain implements Serializable{
    
    
	private static final long serialVersionUID = 1L;
	private String url;

    public EvolutionChain() {
    }

    public EvolutionChain(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{url=").append(url);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
