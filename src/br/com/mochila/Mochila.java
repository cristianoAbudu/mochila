package br.com.mochila;

import java.util.*;

import br.com.mochila.comportamento.IObjetoParaMochila;

import java.lang.Exception;

public class Mochila {
	
	private List<IObjetoParaMochila> objetoList = new ArrayList<>();
	

	public void adicionarObjeto(IObjetoParaMochila objetoParaMochila) throws Exception {
		if(pesoAtual() + objetoParaMochila.getPesoEmGramas() > 3000) {
			throw new Exception("A mochila não deve ser mais pesada do que 3 kg.");
		}
		objetoList.add(objetoParaMochila);
		
	}
	
	private int pesoAtual() {
		int peso = 0;
		for(IObjetoParaMochila objetoParaMochila : objetoList) {
			peso += objetoParaMochila.getPesoEmGramas();
		}
		return peso;
	}

	public void removerObjeto(IObjetoParaMochila objetoParaMochila) {
		objetoList.remove(objetoParaMochila);
	}
	
	public List<IObjetoParaMochila> getObjetoList() {
		return objetoList;
	}

}
