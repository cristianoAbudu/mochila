package br.com.mochila.comportamento;

import br.com.mochila.TamanhoObjetoEnum;

public interface IObjetoParaMochila {

	public int getPesoEmGramas();
	
	public TamanhoObjetoEnum getTamanho();	
	
	public String toString();

}
