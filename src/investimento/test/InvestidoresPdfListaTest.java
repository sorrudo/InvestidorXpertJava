package investimento.test;

import br.com.fiap.investimento.dao.InvestidorPFDAO;
import br.com.fiap.investimento.model.InvestidorPF;

import java.util.List;

public class InvestidoresPdfListaTest {

	public static void main(String[] args) {

		InvestidorPFDAO dao = new InvestidorPFDAO();
		List<InvestidorPF> lista = dao.listarTodos();

		for (InvestidorPF investidorPF : lista) {
			System.out.println(investidorPF);
		}

	}

}
