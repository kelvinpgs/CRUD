package com.example.CRUD.domain.classes;

import com.example.CRUD.domain.enuns.Profissoes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Empregado extends Pessoa {
    private String matricula;

    @Override
    public void aniversario(){
        if (this.getProfissao().equals(Profissoes.METALURGICO)
        ) {
            this.setIdade(this.getIdade() + 2);
        }else{
            this.setIdade(this.getIdade() + 1);
        }
    }
}
