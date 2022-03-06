package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Home {
    
    private String front_default;
    private String front_female;
    private String front_shiny;
    private String front_shiny_female;
    
    public Home(){}

    public Home(String front_default, String front_female, String front_shiny, String front_shiny_female) {
        this.front_default = front_default;
        this.front_female = front_female;
        this.front_shiny = front_shiny;
        this.front_shiny_female = front_shiny_female;
    }

    public String getFront_default() {
        return front_default;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }

    public String getFront_female() {
        return front_female;
    }

    public void setFront_female(String front_female) {
        this.front_female = front_female;
    }

    public String getFront_shiny() {
        return front_shiny;
    }

    public void setFront_shiny(String front_shiny) {
        this.front_shiny = front_shiny;
    }

    public String getFront_shiny_female() {
        return front_shiny_female;
    }

    public void setFront_shiny_female(String front_shiny_female) {
        this.front_shiny_female = front_shiny_female;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.front_default);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Home other = (Home) obj;
        if (!Objects.equals(this.front_default, other.front_default)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("front_default=").append(front_default);
        sb.append(", front_female=").append(front_female);
        sb.append(", front_shiny=").append(front_shiny);
        sb.append(", front_shiny_female=").append(front_shiny_female);        
        return sb.toString();
    }
    
    
}
