package Meldia.Alegla.Pokedex.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import Meldia.Alegla.Pokedex.models.Pokemon;


@Controller
public class PokeControl {

	String searchPoke = "clefairy";
	private static final Logger log = LoggerFactory.getLogger(PokeControl.class);
	private static final String URL = "https://pokeapi.co/api/v2/pokemon/clefairy/";	
	private final RestTemplate restTemplate;
	Pokemon pokemon = new Pokemon();
	
	@Autowired
	public PokeControl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
		
	    
	    @GetMapping("/index")
		   public String index() {	   	    		    	
	    	pokemon = restTemplate.getForObject(PokeControl.URL, Pokemon.class);
	    	log.info("POKEMON WORKING FINE = " + pokemon);	    	
	    	return "index";
		    }
}
