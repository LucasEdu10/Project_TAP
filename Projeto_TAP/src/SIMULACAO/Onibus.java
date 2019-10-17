package SIMULACAO;

public class Onibus implements Runnable {

	private int capMax;
	private String tipo;
	int temp;
	private Parada parada;
	Pista pista;
	private int idOn;
	private Parada id;
	private Parada qPassageiros;

	public Onibus(int idOn, String tipo, int capMax, Pista pista, Parada parada) {
		this.idOn = idOn;
		this.tipo = tipo;
		this.capMax = capMax;
		this.pista = pista;
		this.parada = parada;
	}

	public Parada getPassageiros() {
		return qPassageiros;
	}

	public void setPassageiros(Parada qPassageiros) {
		this.qPassageiros = qPassageiros;
	}

	public int getIdOn() {
		return idOn;
	}

	public void setIdOn(int idOn) {
		this.idOn = idOn;
	}

	public Parada getId() {
		return id;
	}

	public void setId(Parada id) {
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

	public int getcapMax() {
		return capMax;
	}

	public void setcapMax(int capMax) {
		this.capMax = capMax;
	}

	@Override
	public void run() {
		System.out.println(tipo + " Onibus partindo...");
		for (int p = this.parada.getId(); p < this.pista.paradas.size() - 1; p++) {
			this.parada.setId(p);
			Parada proximaParada = pista.proximaParada(this.parada);
			Parada embarcar = pista.pararEmbarcar(this.parada);
			synchronized (proximaParada) {
				proximaParada.getId();
				System.out.println("O onibus do tipo: " + tipo + " Está indo para a parada... "
						+ String.valueOf(proximaParada.getId()));
				System.out.println("Parada numero "+String.valueOf(proximaParada.getId()+" aqui: "+embarcar.getPassageiros())); //Tentei pegar a quantidade de passageiros pelo get 
			}
		}

		//System.out.println("Parada numero "+String.valueOf(proximaParada.getId()+"aqui: "+pista.pararEmbarcar(parada));
	//	int pessoas = pista.pararEmbarcar(this.qPassageiros);
		//System.out.println("Numero: " + pessoas +"<<<<<<<");
		//System.out.println(tipo+" Numero aleatorio: "+pista.subirAle(capMax));
		//System.out.println("Numero: "+parada.subirAle(capMax));
		//System.out.println("Parada numero: "+pista.pararEmbarcar(qPassageiros));
		
	}
}