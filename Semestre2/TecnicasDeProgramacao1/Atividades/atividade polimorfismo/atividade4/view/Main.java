package br.edu.fatecpg.pagamento.view;
import br.edu.fatecpg.pagamento.model.*;


public class Main {

	public static void main(String[] args) {
		
		Pagamento pag = new Pagamento();
		PagamentoCartao pagC = new PagamentoCartao();
		PagamentoBoleto pagB = new PagamentoBoleto();
		
		pag.processarPagamento();
		pagB.processarPagamento();
		pagC.processarPagamento();
		
		

	}

}
