package com.example.CRUD.domain.classes;

import com.example.CRUD.domain.enuns.Profissoes;
import com.example.CRUD.domain.interfaces.IPessoa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa implements IPessoa {
    private String nome;
    private Float altura;
    private Integer idade;
    private Profissoes profissao;


    @Override
    public void aniversario() {
        this.setIdade(this.getIdade() + 1);

    }

    @Override
    public void dormir() {

    }

    @Override
    public void comer() {

    }
}
