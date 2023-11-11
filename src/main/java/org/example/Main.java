package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Main.class);
    public static void main( String[] args ) {
        LOGGER.info("Estou iniciando o metodo main");
        if(true){
            LOGGER.debug("Entrei no if qq");
        }
        try{
            throw new RuntimeException("Usuario Invalido = " + "lgloria");
        }catch (RuntimeException ex){
            LOGGER.error(ex.getMessage());
        }
        LOGGER.debug("Estou finalizando  o metodo main");
    }
}