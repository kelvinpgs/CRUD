package com.example.CRUD;

import com.example.CRUD.domain.classes.Carro;
import com.example.CRUD.domain.classes.Empregado;
import com.example.CRUD.domain.classes.Motorista;
import com.example.CRUD.domain.enuns.Profissoes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);

		Carro carro = new Carro();
		carro.setRoda("plastico");

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
	}





}
