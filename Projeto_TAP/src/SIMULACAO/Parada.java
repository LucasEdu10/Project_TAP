package SIMULACAO;

import java.util.Random;

public class Parada {
	
	Random pass = new Random();

	static private int passageiros;
	String tipoParada;
	private int id;

	public Parada() {}
	
	public Parada(int id, int passageiros, String tipoParada) {
		this.id = id;
		Parada.passageiros = passageiros;
		this.tipoParada = tipoParada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static  int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		Parada.passageiros = passageiros;
	}
	
	public int subirAle() {
		return pass.nextInt(passageiros);
	}
	
	public int descer(int c) {
		return c;
	}
}
