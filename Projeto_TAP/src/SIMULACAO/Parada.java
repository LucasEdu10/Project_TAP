package SIMULACAO;

import java.util.Random;

public class Parada {
	
	Random pass = new Random();

	private int passageiros;
	String tipoParada;
	private int id;
	int total;

	public Parada() {}
	
	public Parada(int id, int passageiros, String tipoParada) {
		this.id = id;
		this.passageiros = passageiros;
		this.tipoParada = tipoParada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
	public int subirAle(int passageiros) {
		int p = pass.nextInt(passageiros);
		if(p > Onibus.getcapMax()) {
			System.out.println("Onibus lotado");
		}else {
			total = p;
		}
		return total;
	}
	
	public int descer(int c) {
		return c;
	}
}
