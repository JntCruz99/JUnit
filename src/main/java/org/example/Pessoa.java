package org.example;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String name;

    private LocalDateTime nascimento;

    public Pessoa() {
    }

    public Pessoa(String name, LocalDateTime nascimento) {
        this.name = name;
        this.nascimento = nascimento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public void setIdade(int idade) {
        this.nascimento = nascimento;
    }

    public boolean ehMaiorDeIdade(){
        return getIdade() >= 18;
    }
}
