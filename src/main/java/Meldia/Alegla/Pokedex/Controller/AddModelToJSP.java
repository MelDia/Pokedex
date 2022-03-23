package Meldia.Alegla.Pokedex.Controller;

import org.springframework.ui.Model;

import Meldia.Alegla.Pokedex.models.Pokemon;

public class AddModelToJSP {

    public static void addAttribute(Model model, Pokemon pokemon) {
        if (pokemon == null) {
            model.addAttribute("id", " ");
            model.addAttribute("name", " ");
            model.addAttribute("baseExperience", " ");
            model.addAttribute("height", " ");
            model.addAttribute("weight", " ");
            model.addAttribute("type", " ");
            model.addAttribute("type2", " ");
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
            model.addAttribute("ability", " ");
            model.addAttribute("ability2", " ");

        }else{
            model.addAttribute("id", pokemon.getId());
            model.addAttribute("name", pokemon.getName());
            model.addAttribute("baseExperience", pokemon.getBase_experience());
            model.addAttribute("height", pokemon.getHeight());
            model.addAttribute("weight", pokemon.getWeight());

            model.addAttribute("type", pokemon.getTypes().get(0).getType().getName());
            if (pokemon.getTypes().size() == 2) {
                model.addAttribute("type2", pokemon.getTypes().get(1).getType().getName());
            }
            
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
            
            model.addAttribute("ability", pokemon.getAbilities().get(0).getAbility().getName());
            if (pokemon.getAbilities().size() == 2) {
                model.addAttribute("ability2", pokemon.getAbilities().get(1).getAbility().getName());
            }
            
        }
    }
}
