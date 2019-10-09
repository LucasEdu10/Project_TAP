package SIMULACAO;

public class Onibus implements Runnable {

	private Parada qPessoas;
	private String tipo;
	int temp;
	private Parada parada;
	Pista pista;

	public Onibus(String tipo, Parada qPessoas, Pista pista, Parada parada) {
		this.tipo = tipo;
		this.qPessoas = qPessoas;
		this.pista = pista;
		this.parada = parada;
	}

	public void paradaOn(Parada parada) {
		this.parada = parada;
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

	public Parada getqPessoas() {
		return qPessoas;
	}
	
	public void setqPessoas(Parada qPessoas) {
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
				//Parada paraEmbarcar = pista.pararEmbarcar(this.qPessoas);
				//System.out.println("Quantidade para embarcar: "+paraEmbarcar);
			}
			
		}
	}
}