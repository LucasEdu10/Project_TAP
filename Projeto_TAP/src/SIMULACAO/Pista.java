package SIMULACAO;

import java.util.ArrayList;
import java.util.Random;

public class Pista {

	Random pass = new Random();

	ArrayList<Parada> paradas = new ArrayList<Parada>();

	private int p1, p2;
	Parada pessoas;

	public Parada proximaParada(Parada paradaAtual) {
		return this.paradas.get(paradaAtual.getId() + 1);
	}

	public int pararEmbarcar(Parada qPass) {

		p1 = this.paradas.get(qPass.getId()).getPassageiros();// + qPass.subirAle();
		// String.valueOf(pessoa = this.paradas.get(qPass.getId()).getPassageiros())
		// ;//+ qPass.subirAle());
		// qPass = this.paradas.get(qPass.getId()).getPassageiros();
		// System.out.println(pessoa+"<<<<<<<");
		// + pessoa.subirAle(); //quando deixo o metodo static ele só pega o valor da
		// ultima parada "4"
		// System.out.println(Parada.getPassageiros());//+ pessoa.subirAle();
		// return p1; pessoa; return this.paradas.get(qPass.getId()); //+
		// qPass.subirAle());
		// return this.paradas.get(qPass.getId());

		/*
		 * if(qPass.getId() != 0) { p1 =
		 * this.paradas.get(qPass.getId()).getPassageiros() +
		 * this.paradas.get(qPass.getId()).getPassageiros(); } return p1;
		 */
		// p1 = this.paradas.get(qPass.getId()).getPassageiros();
		return p1;

	}

	public int deixarParada(Parada qPassageiros) {
		String.valueOf(p2 = this.paradas.get(qPassageiros.getId()).getPassageiros() - qPassageiros.subirAle(p1));
		return p2;
	}

	public void adicionarParada(Parada parada) {
		paradas.add(parada);
	}
}
