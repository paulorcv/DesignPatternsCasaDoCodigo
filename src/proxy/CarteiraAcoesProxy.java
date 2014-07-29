package proxy;

import observer.CarteiraAcoes;
import observer.Observador;

public class CarteiraAcoesProxy {

	private CarteiraAcoes carteira;

	public void adicionaAcoes(String acao, Integer qtd) {
		carteira.adicionaAcoes(acao, qtd);
	}

	public void addObservador(Observador o) {
		carteira.addObservador(o);
	}

	public int hashCode() {
		return carteira.hashCode();
	}

	public boolean equals(Object obj) {
		return carteira.equals(obj);
	}

	public String toString() {
		return carteira.toString();
	}
	
	
}
