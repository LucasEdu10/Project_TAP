package SIMULACAO;

public class Parada {

	private Onibus passageiros;
	String tipoParada;
	private int id;

	public Parada() {}
	
	public Parada(int id, Onibus passageiros, String tipoParada) {
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

	public Onibus getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(Onibus passageiros) {
		this.passageiros = passageiros;
	}
}
