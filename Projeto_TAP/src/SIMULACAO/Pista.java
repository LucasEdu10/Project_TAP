package SIMULACAO;

import java.util.ArrayList;
import java.util.Random;

public class Pista {
	
	Random pass = new Random();

	ArrayList<Parada> paradas = new ArrayList<Parada>();
	ArrayList<Integer> qPessoas = new ArrayList<Integer>();

	public Parada proximaParada(Parada paradaAtual) {
		return this.paradas.get(paradaAtual.getId() + 1);
	}

	public Parada pararEmbarcar(Parada qPassageiros) {
		/*qPessoas.add(qPassageiros);
		qPassageiros = subirAle(qPassageiros); //+ pass.nextInt(qPassageiros); //Se eu comentar o segundo PASS ele deixa os valores de Onibus zerados
		return qPassageiros;*/
		
		//Parada proximaParada = proximaParada(qPassageiros);
		//System.out.println("Parada numero aqui: "+ String.valueOf(proximaParada.getPassageiros()));
		return qPassageiros;
	}

	public void deixarParada(Parada qPassageiros) {

	}

	public void adicionarParada(Parada parada) {
		paradas.add(parada);
	}
	
	public int subirAle(int pessoas) { // Fiz para poder gerar os numeros aleatorios de acordo com a quantidade no array
		pessoas = qPessoas.get(pass.nextInt(qPessoas.size())); // Mas não esta funcionando normalmente 
		return pessoas;
	}
}
