package Meldia.Alegla.Pokedex.Controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
		   public String index(Model model) {	   	    		    	
	    	pokemon = restTemplate.getForObject(PokeControl.URL, Pokemon.class);
	    	log.info("POKEMON WORKING FINE = " + pokemon);	  	    	
	    	model.addAttribute("id", pokemon.getId());
	    	model.addAttribute("name", pokemon.getName());
	    	model.addAttribute("baseExperience", pokemon.getBase_experience());
	    	model.addAttribute("height", pokemon.getHeight());
	    	model.addAttribute("weight", pokemon.getWeight());
	    	model.addAttribute("type", pokemon.getTypes().get(0).getType().getName());
	    	model.addAttribute("sprite", pokemon.getSprites().getFront_default());
	    	return "index";
		    }
	    
        //	    @PostMapping("/searchPokemon")
	    //	    public String searchPokemon(Model model) {
	    //model.getAttribute("search");
	    //return "index";
	    //}
	    
	    
}
