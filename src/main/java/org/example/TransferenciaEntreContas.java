package org.example;

public class TransferenciaEntreContas {

    public void transfere(Conta contaorigem, Conta contaDestino, int valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor dever ser maior que zero");
        }
    }

}
