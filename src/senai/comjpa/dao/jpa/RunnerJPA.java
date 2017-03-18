package senai.comjpa.dao.jpa;

import senai.comjpa.pojo.Cidade;
import senai.comjpa.pojo.Cliente;
import senai.comjpa.pojo.Estado;

public class RunnerJPA {

	public static void main(String[] args) {

		Estado sc = new Estado();
		sc.setNome("Santa Catarina");
		sc.setUf("SC");
		
		Cidade joi = new Cidade();
		joi.setUf(sc);
		joi.setNome("Joinville");
		
		Cliente eu = new Cliente();
		eu.setCidade(joi);
		eu.setEstado(sc);
		eu.setNome("Jeronimo");
		
		ClienteJPADAO jpa = new ClienteJPADAO();
		jpa.incluir(eu);
		
		Cliente cli = (Cliente) jpa.buscarPorId(2);
		System.out.println(cli.getNome());
	}
}
