package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Species {
    
    private String name;
    private String url;
       

    public Species() {
    }

    public Species(String name, String url) {
        this.name = name;
        this.url = url;        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        sb.append("{name=").append(name);
        sb.append(", url=").append(url);     
        sb.append('}');
        return sb.toString();
    }  
       
    
}
