package com.example.CRUD.domain.classes;

import com.example.CRUD.domain.enuns.Status;
import com.example.CRUD.domain.interfaces.IEmpresa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Entrevista extends Empresa implements IEmpresa {
    private String responsavelRH;
    private String candidato;
    private String status;


    @Override
    public void contratado() {
        if (this.status.equals(Status.APROVADO)){
            Empregado empregado = new Empregado();
        }

    }

    @Override
    public void desligado() {

    }
}
