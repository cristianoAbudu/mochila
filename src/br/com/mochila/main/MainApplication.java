package br.com.mochila.main;

import br.com.mochila.GarrafaDeAgua;
import br.com.mochila.Mochila;
import br.com.mochila.Tablet;
import br.com.mochila.TelefoneCelular;
import br.com.mochila.comportamento.IObjetoParaMochila;
import br.com.mochila.comportamento.ObjetoLigavel;

public class MainApplication {
	
	public static void main(String[] args) throws Exception {
		Mochila mochila = new Mochila();
		
		Tablet tablet = new Tablet(100);
		mochila.adicionarObjeto(tablet);
		mochila.adicionarObjeto(new TelefoneCelular(200));
		mochila.adicionarObjeto(new GarrafaDeAgua(1000));
		
		for(IObjetoParaMochila objeto : mochila.getObjetoList()) {
			if(objeto instanceof ObjetoLigavel) {
				((ObjetoLigavel) objeto).ligar();
			}
		}
		mochila.getObjetoList();
		
		mochila.removerObjeto(tablet);
		mochila.getObjetoList();
		
		mochila.removerObjeto(new Tablet(321));
		mochila.getObjetoList();
		
		for(IObjetoParaMochila objeto : mochila.getObjetoList()) {
			System.out.println(objeto);
		}
		
	}

}
