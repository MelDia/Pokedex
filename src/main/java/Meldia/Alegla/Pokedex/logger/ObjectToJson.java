package Meldia.Alegla.Pokedex.logger;

import org.slf4j.Logger;

public class ObjectToJson {
    
    
    public static void showObject(Logger log,Object obj){
        log.info(obj.toString());
    }
    
}
