package SIMULACAO;

public class Parada {

	int passageiros;
	String tipoParada;
	private int id;

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
}
