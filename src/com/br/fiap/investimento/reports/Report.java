package com.br.fiap.investimento.reports;

public interface Report {

	public void print(String redeImpressora);
	
	public void pdf();
	
	public void excel();
	
	public void txt();
	
}
