package Meldia.Alegla.Pokedex.Run;


import Meldia.Alegla.Pokedex.logger.ObjectToJson;
import models.Evolution;
import models.Pokemon;
import models.Species;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PokedexApplication {

	public static void main(String[] args) {
        SpringApplication.run(PokedexApplication.class, args);
    }

    private static final Logger log = LoggerFactory.getLogger(PokedexApplication.class);
    
    //@Autowired
    Pokemon pokemon = new Pokemon();
    Evolution evolution = new Evolution();
    Species species = new Species();
    String searchPoke = "clefairy";
    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
             pokemon = restTemplate.getForObject(
                    "https://pokeapi.co/api/v2/pokemon/" + searchPoke + "/", Pokemon.class);          
          ObjectToJson.showObject(log, pokemon);     

            evolution = restTemplate.getForObject(pokemon.getSpecies().getUrl(), Evolution.class);            
            ObjectToJson.showObject(log, evolution);
        };
        
        
        
    }

}
