package br.com.mochila;

import br.com.mochila.comportamento.IObjetoParaMochila;
import br.com.mochila.comportamento.ObjetoLigavel;

public class Notebook implements IObjetoParaMochila, ObjetoLigavel {
	private int peso = 0;
	private TamanhoObjetoEnum tamanho;
	private Boolean aberto = false;
	private Boolean ligado = false;

	
	public Notebook(int peso) {
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
		return "Notebook Peso " + peso + " tamanho " + tamanho + " aberto " + aberto + " ligado " + ligado; 
	}

}
