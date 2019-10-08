package SIMULACAO;

public class Onibus implements Runnable {

	private int qPessoas;
	private String tipo;
	int temp;
	private Parada parada;
	Pista pista;

	public Onibus(String tipo, int qPessoas, Pista pista, Parada parada) {
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

	public int getqPessoas() {
		return qPessoas;
	}

	@Override
	public void run() {
		if(this.parada.getId() == 0 ) {
			for(int i=0; i< this.pista.paradas.size(); i++) {
				pista.anda(true);
				System.out.println(tipo + " Onibus partindo...");
			}
			pista.para(false);
		}else {
			for(int i=0; i< this.pista.paradas.size(); i++) {
				pista.para(true);
				System.out.println(tipo + " Onibus partindo...");
			}
			pista.para(false);
		}
		/*System.out.println(tipo + " Onibus partindo...");
		for (int p = this.parada.getId(); p < this.pista.paradas.size()-1; p++) {
			this.parada.setId(p);
			Parada proximaParada = pista.proximaParada(this.parada);
			synchronized (proximaParada) {
				proximaParada.getId();
				System.out.println("O onibus do tipo: " + tipo + " Está indo para a parada... "
						+ String.valueOf(proximaParada.getId()));
			}
			
		}*/
	}
}