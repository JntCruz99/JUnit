package org.example;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexão(){
        LOGGER.info("Iniciar Conexão");
    }
    public static void finalizarConexão(){
        LOGGER.info("Finalizar Conexão");
    }

    public static void insereDados(Pessoa pessoa){
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        LOGGER.info("removeu dados");
    }

}
