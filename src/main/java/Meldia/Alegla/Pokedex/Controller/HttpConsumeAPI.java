package Meldia.Alegla.Pokedex.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import Meldia.Alegla.Pokedex.models.Pokemon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.HttpClientErrorException;

public class HttpConsumeAPI {

	private final RestTemplate restTemplate;
        private static final Logger log = LoggerFactory.getLogger(HttpConsumeAPI.class);
        
	@Autowired
	public HttpConsumeAPI(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public Pokemon HttpConsume(String searchPokemon, Pokemon pokemon) {
		String URL = "https://pokeapi.co/api/v2/pokemon/" + searchPokemon + "/";
		try{
                    pokemon = restTemplate.getForObject(URL, Pokemon.class);                 
                }catch(HttpClientErrorException ex){                    
                    log.info("API POKEMON - ERROR STATUS = " + ex.getStatusCode());
                    log.info("RESPONSE API - ERROR = " + ex.getMessage());                  
                    pokemon = null;
                   // Pokemon poke = new Pokemon(0, "Not found", 0, 0, 0, 0, null, "Not found", "Not found");
                    //Integer id, String name, Integer base_experience, Integer height,
            //Integer weight, Sprites sprites, List<Types> types, List<Stats> stats, List<Abilities> abilities)
                }           
		return pokemon;
	}
}