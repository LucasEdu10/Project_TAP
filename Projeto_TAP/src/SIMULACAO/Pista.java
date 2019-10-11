package SIMULACAO;

import java.util.ArrayList;
import java.util.Random;

public class Pista {

	ArrayList<Parada> paradas = new ArrayList<Parada>();
	Random pass = new  Random();

	public Parada proximaParada(Parada paradaAtual) {
		return this.paradas.get(paradaAtual.getId() + 1);
	}

	public Onibus pararEmbarcar(Onibus id, Onibus qPassageiros) {
		if(this.equals(id) == 0) {
			int qtd = pass.nextInt(38);
			qPassageiros = Onibus.this.setqPessoas(4);
		}
		return qPassageiros;
	}

	public void deixarParada() {

	}

	public void adicionarParada(Parada parada) {
		paradas.add(parada);
	}
}
