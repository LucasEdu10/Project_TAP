package SIMULACAO;

import java.util.ArrayList;
import java.util.Random;

public class Pista {

	ArrayList<Parada> paradas = new ArrayList<Parada>();
	Random pass = new  Random();

	public Parada proximaParada(Parada paradaAtual) {
		return this.paradas.get(paradaAtual.getId() + 1);
	}

	public int pararEmbarcar(Parada paradaAtual) {
		if(paradaAtual.getId() == 1) {
			Onibus.setqPessoas(pass.nextInt(38));
			
		}
		return 0;
	}

	public void deixarParada() {

	}

	public void adicionarParada(Parada parada) {
		paradas.add(parada);
	}
}
