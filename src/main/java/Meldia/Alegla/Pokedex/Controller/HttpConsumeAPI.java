package Meldia.Alegla.Pokedex.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import Meldia.Alegla.Pokedex.models.Pokemon;

public class HttpConsumeAPI {

	private final RestTemplate restTemplate;

	@Autowired
	public HttpConsumeAPI(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public Pokemon HttpConsume(String searchPokemon, Pokemon pokemon) {
		String URL = "https://pokeapi.co/api/v2/pokemon/" + searchPokemon + "/";
		pokemon = restTemplate.getForObject(URL, Pokemon.class);
		return pokemon;
	}
}
