package Meldia.Alegla.Pokedex.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats implements Serializable{
    private static final long serialVersionUID = 1L;
    private Stat stat;
    private String base_stat;

    public Stats() {
    }

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    public String getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(String base_stat) {
        this.base_stat = base_stat;
    }

    @Override
    public String toString() {
        return "Stats{" + stat + ", base_stat=" + base_stat + '}';
    }
    
    
}
