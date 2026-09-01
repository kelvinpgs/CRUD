package com.example.CRUD;

import com.example.CRUD.domain.classes.*;
import com.example.CRUD.domain.enuns.Profissoes;
import com.example.CRUD.domain.enuns.Status;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);

		Empregado empregado = new Empregado();
		empregado.setIdade(43);
		empregado.setProfissao(Profissoes.METALURGICO);
		System.out.println("Idade: " + empregado.getIdade() + " " + empregado.getProfissao());
		empregado.aniversario();
		System.out.println("Idade nova: " + empregado.getIdade() + " " + empregado.getProfissao());

		Empregado desenvolvedor = new Empregado();
		desenvolvedor.setIdade(18);
		desenvolvedor.setProfissao(Profissoes.DESENVOLVEDOR);
		System.out.println("Idade: " + desenvolvedor.getIdade() + " " + desenvolvedor.getProfissao());
		desenvolvedor.aniversario();
		System.out.println("Idade nova: " + desenvolvedor.getIdade() + " " + desenvolvedor.getProfissao());

		Entrevista entrevista = new Entrevista();
		entrevista.setCandidato("Joãozinho");
		entrevista.setResponsavelRH("Maria RH");
		entrevista.setArea("Obra");
		entrevista.setLocal("Canoas");
		entrevista.setNome("EmpresaX");
		entrevista.setStatus(String.valueOf(Status.APROVADO));
		entrevista.contratado();
		System.out.println("Olá" + entrevista.getCandidato() + "! Parabéns, você foi " + entrevista.getStatus() + " pela " + entrevista.getNome());
	}
}
