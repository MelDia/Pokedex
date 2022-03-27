package Meldia.Alegla.Pokedex.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import Meldia.Alegla.Pokedex.models.Pokemon;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PokeControl {

	private String searchPokemon;
	private static final Logger log = LoggerFactory.getLogger(PokeControl.class);
	private Pokemon pokemon;
	private final HttpConsumeAPI consume = new HttpConsumeAPI(new RestTemplate());


	@GetMapping("/index")
	public String index(Model model) {
		pokemon = null;
		AddModelToJSP.addAttribute(model, pokemon);
		return "index";
	}

	
	@RequestMapping(value = "/searchPokemon", method = RequestMethod.POST)
	public String searching(@ModelAttribute Pokemon pokemon, Model model) {
		searchPokemon = pokemon.getName();                
                //easter egg meme
                if (searchPokemon.equalsIgnoreCase("vamo a calmarno")) searchPokemon = "squirtle";                
		pokemon = consume.HttpConsume(searchPokemon, pokemon);
                
		log.info("Response Consume API = " + pokemon);
		AddModelToJSP.addAttribute(model, pokemon);
		return "index";
	}

}


