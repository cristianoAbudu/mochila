package br.com.mochila;

import br.com.mochila.comportamento.IObjetoParaMochila;

public class GarrafaDeAgua implements IObjetoParaMochila	{
	
	private int peso = 0;
	private TamanhoObjetoEnum tamanho;
	private Boolean aberto = false;
	

	public GarrafaDeAgua(int peso) {
		this.peso = peso;
	}

	public int getPesoEmGramas() {
		return peso;
	}
	
	public TamanhoObjetoEnum getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(TamanhoObjetoEnum tamanho) {
		this.tamanho = tamanho;
	}
	
	public void abrir() {
		aberto = true;
	}
	
	public void fechar() {
		aberto = false;
	}

	public Boolean getAberto() {
		return aberto;
	}
	
	public String toString() {
		return "GarrafaDeAgua Peso " + peso + " tamanho " + tamanho + " aberto " + aberto; 
	}
	

}
