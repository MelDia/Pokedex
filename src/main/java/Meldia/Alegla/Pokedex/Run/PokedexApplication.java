package Meldia.Alegla.Pokedex.Run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@ComponentScan("Meldia.Alegla.Pokedex.Controller")
public class PokedexApplication{

	public static void main(String[] args) {
        SpringApplication.run(PokedexApplication.class, args);        
    }

	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
        
    

}
