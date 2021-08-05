package com.br.fiap.investimento.dao;

import com.br.fiap.investimento.model.InvestidorPF;

import java.util.ArrayList;
import java.util.List;

public class InvestidorPFDAO {

	//entrada OK >> processamento OK >> sa�da OK
	
	// cadastrar - INSERT
	public boolean cadastrar( InvestidorPF investidor ) {
		// processamento - Comando SQL
		return true;
	}
	
	
	// alterar - UPDATE
	
	// excluir - DELETE
	
	
	
	// consultar - SELECT BY ID 
	public InvestidorPF consultarPorId(int id) {
		// processamento
		return new InvestidorPF();
	}
	
	public InvestidorPF consultarPorCpf(String cpf) {
		// processamento
		return new InvestidorPF();
	}
	
	
	// listarTodos - SELECT ALL
	public List<InvestidorPF> listarTodos() {
		
		// Obtendo o Driver - Oracle / Mysql / SQLServer
		// Abrindo a Conexao
		// Preparando o comando SQL
		// >>>> SELECT * FROM TB_INVESTIDOR
		// Executo o comando SQL
		// Obtendo o retorno do SQL
		// Integrando o retorno SQL com o Java
		List<InvestidorPF> investidores = new ArrayList<InvestidorPF>();
		investidores.add(new InvestidorPF("Felipe", 10));
		investidores.add(new InvestidorPF("Fl�vio", 11));
		investidores.add(new InvestidorPF("Marih�", 12));
		investidores.add(new InvestidorPF("Leonardo", 13));

		return investidores;

		// Fechando a conexao
	}
	
}
