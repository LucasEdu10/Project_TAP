package SIMULACAO;

import java.util.ArrayList;

public class Pista {

	boolean anda, para;

	ArrayList<Parada> paradas = new ArrayList<Parada>();

	public Parada proximaParada(Parada paradaAtual) {
		return this.paradas.get(paradaAtual.getId() + 1);
	}

	public void pararEmbarcar() {

	}

	public void deixarParada() {

	}

	public void adicionarParada(Parada parada) {
		paradas.add(parada);
	}

	synchronized void anda(boolean Executando) {

		if (!Executando) {
			anda = true;
			notify();
			return;
		}
		// System.out.println("Onibus andando...");
		anda = true;
		notify();
		try {
			while (anda) {
				wait();
			}
		} catch (InterruptedException e) {
			System.out.println("A Thread foi interrompida");
		}
	}

	synchronized void para(boolean Executando) {

		if (!Executando) {
			anda = false;
			notify();
			return;
		}
		// System.out.println("Parando...");
		anda = false;
		notify();
		try {
			Thread.sleep(100);
			while (!anda) {
				wait();
			}
		} catch (InterruptedException e) {
			System.out.println("A Thread foi interrompida");
		}
	}
}
