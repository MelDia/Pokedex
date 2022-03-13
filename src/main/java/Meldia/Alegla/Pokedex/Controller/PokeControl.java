package Meldia.Alegla.Pokedex.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import Meldia.Alegla.Pokedex.models.Pokemon;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PokeControl {

    String searchPokemon = " ";
    private static final Logger log = LoggerFactory.getLogger(PokeControl.class);

    private final RestTemplate restTemplate;
    Pokemon pokemon = new Pokemon();

    public Pokemon HttpConsume(String searchPokemon) {
        String URL = "https://pokeapi.co/api/v2/pokemon/" + searchPokemon + "/";
        pokemon = restTemplate.getForObject(URL, Pokemon.class);
        log.info("CONSUME API = " + pokemon);
        return pokemon;
    }

    @Autowired
    public PokeControl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/index")
    public String index(Model model) {
        pokemon = HttpConsume(searchPokemon);
        
        model.addAttribute("id", " ");
        model.addAttribute("name", " ");
        model.addAttribute("baseExperience", " ");
        model.addAttribute("height", " ");
        model.addAttribute("weight", " ");

        model.addAttribute("type", " ");

        model.addAttribute("sprite", " ");

        model.addAttribute("stats", " ");
        model.addAttribute("baseStat", " ");
        model.addAttribute("stats1", " ");
        model.addAttribute("baseStat1", " ");
        model.addAttribute("stats2", " ");
        model.addAttribute("baseStat2", " ");
        model.addAttribute("stats3", " ");
        model.addAttribute("baseStat3", " ");
        model.addAttribute("stats4", " ");
        model.addAttribute("baseStat4", " ");
        model.addAttribute("stats5", " ");
        model.addAttribute("baseStat5", " ");
        return "index";
    }

    @RequestMapping(value = "/searchPokemon", method = RequestMethod.POST)
    public String searching(@ModelAttribute Pokemon pokemon, Model model) {
        searchPokemon = pokemon.getName();
        pokemon = HttpConsume(searchPokemon);
        
        model.addAttribute("id", pokemon.getId());
        model.addAttribute("name", pokemon.getName());
        model.addAttribute("baseExperience", pokemon.getBase_experience());
        model.addAttribute("height", pokemon.getHeight());
        model.addAttribute("weight", pokemon.getWeight());

        model.addAttribute("type", pokemon.getTypes().get(0).getType().getName());

        model.addAttribute("sprite", pokemon.getSprites().getFront_default());

        model.addAttribute("stats", pokemon.getStats().get(0).getStat().getName());
        model.addAttribute("baseStat", pokemon.getStats().get(0).getBase_stat());
        model.addAttribute("stats1", pokemon.getStats().get(1).getStat().getName());
        model.addAttribute("baseStat1", pokemon.getStats().get(1).getBase_stat());
        model.addAttribute("stats2", pokemon.getStats().get(2).getStat().getName());
        model.addAttribute("baseStat2", pokemon.getStats().get(2).getBase_stat());
        model.addAttribute("stats3", pokemon.getStats().get(3).getStat().getName());
        model.addAttribute("baseStat3", pokemon.getStats().get(3).getBase_stat());
        model.addAttribute("stats4", pokemon.getStats().get(4).getStat().getName());
        model.addAttribute("baseStat4", pokemon.getStats().get(4).getBase_stat());
        model.addAttribute("stats5", pokemon.getStats().get(5).getStat().getName());
        model.addAttribute("baseStat5", pokemon.getStats().get(5).getBase_stat());
        return "index";
    }

    //	    @PostMapping("/searchPokemon")
    //	    public String searchPokemon(Model model) {
    //model.addAttribute("search");
    //return "index";
    //}    
}
