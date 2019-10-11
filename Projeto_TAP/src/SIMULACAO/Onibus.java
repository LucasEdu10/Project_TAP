package SIMULACAO;

public class Onibus implements Runnable {

	private Onibus qPessoas;
	private String tipo;
	int temp;
	private Parada parada;
	Pista pista;
	private int id;

	public Onibus(int id, String tipo, Onibus qPessoas, Pista pista, Parada parada) {
		this.setId(id);
		this.tipo = tipo;
		this.qPessoas = qPessoas;
		this.pista = pista;
		this.parada = parada;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public Parada getParada() {
		return parada;
	}

	public void setParada(Parada parada) {
		this.parada = parada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Onibus getqPessoas() {
		return qPessoas;
	}
	
	public void setqPessoas(Onibus qPessoas) {
		this.qPessoas = qPessoas;
	}

	@Override
	public void run() {
		System.out.println(tipo + " Onibus partindo...");
		for (int p = this.parada.getId(); p < this.pista.paradas.size()-1; p++) {
			this.parada.setId(p);
			Parada proximaParada = pista.proximaParada(this.parada);
			synchronized (proximaParada) {
				proximaParada.getId();
				System.out.println("O onibus do tipo: " + tipo + " Está indo para a parada... "
						+ String.valueOf(proximaParada.getId()));
				//Onibus paraEmbarcar = pista.pararEmbarcar(this.qPessoas);
				System.out.println("Quantidade para embarcar: "+pista.pararEmbarcar(id,this.qPessoas));
			}
			
		}
	}
}