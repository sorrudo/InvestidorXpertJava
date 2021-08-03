package investimento.test;



import investimento.dao.InvestidorPFDAO;
import investimento.model.InvestidorPF;

import java.util.List;

public class InvestidoresTelaListaTest {

	public static void main(String[] args) {
		
		InvestidorPFDAO dao = new InvestidorPFDAO();
		List<InvestidorPF> lista = dao.listarTodos();

		for (InvestidorPF investidorPF : lista) {
			System.out.println(investidorPF);
		}
		
	}

}
