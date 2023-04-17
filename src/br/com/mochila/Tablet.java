package br.com.mochila;

import br.com.mochila.comportamento.IObjetoParaMochila;
import br.com.mochila.comportamento.ObjetoLigavel;

public class Tablet implements IObjetoParaMochila, ObjetoLigavel {
	
	private int peso = 0;
	private TamanhoObjetoEnum tamanho;
	private Boolean ligado = false;
	
	public Tablet(int peso) {
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
	
	public void ligar() {
		ligado = true;
	}

	public void desligar() {
		ligado = false;
	}
	
	public Boolean getLigado() {
		return ligado;
	}
	
	public String toString() {
		return "Tablet Peso " + peso + " tamanho " + tamanho + " ligado " + ligado; 
	}


}
