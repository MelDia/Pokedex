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

        } else {
            model.addAttribute("id", pokemon.getId());
            model.addAttribute("name", pokemon.getName());
            model.addAttribute("baseExperience", pokemon.getBase_experience());
            model.addAttribute("height", pokemon.getHeight());
            model.addAttribute("weight", pokemon.getWeight());
            model.addAttribute("sprite", pokemon.getSprites().getFront_default());

            for (int i = 0; i < pokemon.getTypes().size(); i++) {
                model.addAttribute("type" + String.valueOf(i), pokemon.getTypes().get(i).getType().getName());
            }

            for (int i = 0; i < pokemon.getStats().size(); i++) {
                model.addAttribute("stats" + String.valueOf(i), pokemon.getStats().get(i).getStat().getName());
                model.addAttribute("baseStat" + String.valueOf(i), pokemon.getStats().get(i).getBase_stat());
            }

            for (int i = 0; i < pokemon.getAbilities().size(); i++) {
                model.addAttribute("ability" + String.valueOf(i), pokemon.getAbilities().get(i).getAbility().getName());
            }
        }
    }
}
