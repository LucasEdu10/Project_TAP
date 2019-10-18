package SIMULACAO;

import java.util.ArrayList;
import java.util.Random;

public class Pista {
	
	Random pass = new Random();

	ArrayList<Parada> paradas = new ArrayList<Parada>();
	ArrayList<Integer> qPessoas = new ArrayList<Integer>();

	private Parada pessoa;

	public Parada proximaParada(Parada paradaAtual) {
		return this.paradas.get(paradaAtual.getId()+1);
	}

	public int pararEmbarcar() {
		int pessoas = Parada.getPassageiros() + subirAle(); //quando deixo o metodo static ele só pega o valor da ultima parada "4"
		//System.out.println(Parada.getPassageiros());//+ pessoa.subirAle();
		return pessoas;
		//return this.paradas.get(qPassageiros.getId());
	}

	public void deixarParada(Parada qPassageiros) {

	}

	public void adicionarParada(Parada parada) {
		paradas.add(parada);
	}
	
	public int subirAle() { // Fiz para poder gerar os numeros aleatorios de acordo com a quantidade no array
		//pessoas = qPessoas.get(pass.nextInt(qPessoas.size())); // Mas não esta funcionando normalmente 
		//return qPessoas.get(pass.nextInt(qPessoas.size()));
		return pass.nextInt(38);
	}
	
	public Parada passageirosAtual(Parada pessoas) {
		//for(qPessoas)
		return pessoas;
	}
}
