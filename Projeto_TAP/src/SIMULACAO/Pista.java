package SIMULACAO;

import java.util.ArrayList;

public class Pista {

	ArrayList<Parada> paradas = new ArrayList<Parada>();
	ArrayList<Parada> qPessoas = new ArrayList<Parada>();

	public Parada proximaParada(Parada paradaAtual) {
		return this.paradas.get(paradaAtual.getId() + 1);
	}

	public Parada pararEmbarcar(Parada qPassageiros) {
		qPassageiros.subir();
		return qPassageiros;
	}

	public void deixarParada(Parada qPassageiros) {

	}

	public void adicionarParada(Parada parada) {
		paradas.add(parada);
	}
}
