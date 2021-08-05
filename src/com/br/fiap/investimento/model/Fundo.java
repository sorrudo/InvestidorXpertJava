package com.br.fiap.investimento.model;



	public class Fundo {

		private int fundoId;
		private String nomeFundo;


		public Fundo() {

		}

		public Fundo(int fundoId, String nomeFundo) {
			super();
			this.fundoId = fundoId;
			this.nomeFundo = nomeFundo;
		}


		public int getFundoId() {
			return fundoId;
		}
		public void setFundoId(int fundoId) {
			this.fundoId = fundoId;
		}
		public String getNomeFundo() {
			return nomeFundo;
		}
		public void setNomeFundo(String nomeFundo) {
			this.nomeFundo = nomeFundo;
		}

		@Override
		public String toString() {
			String retorno = super.toString();
			return "Fundo [fundoId=" + fundoId + ", nomeFundo=" + nomeFundo + "] " + retorno;
		}





	}



