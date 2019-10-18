package SIMULACAO;

public class Onibus implements Runnable {

	static private int capMax;
	private String tipo;
	int temp;
	static private Parada parada;
	Pista pista;
	private int idOn;
	private Parada id;
	private Parada qPassageiros;

	public Onibus(int idOn, String tipo, int capMax, Pista pista, Parada parada) {
		this.idOn = idOn;
		this.tipo = tipo;
		Onibus.capMax = capMax;
		this.pista = pista;
		Onibus.parada = parada;
	}
	
	public static Parada parada1 = new Parada(0, 1, "Parada onibus 1");
	public static Parada parada2 = new Parada(1, 2, "Parada onibus 2");
	public static Parada parada3 = new Parada(2, 3, "Parada onibus 3");
	public static Parada parada4 = new Parada(3, 4, "Parada onibus 4");

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
		Onibus.parada = parada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static int getcapMax() {
		return capMax;
	}

	public void setcapMax(int capMax) {
		Onibus.capMax = capMax;
	}

	@Override
	public void run() {
		System.out.println(tipo + " Onibus partindo...");
		do {
			for (int p = Onibus.parada.getId(); p < this.pista.paradas.size()-1; p++) {
				Onibus.parada.setId(p);
				Parada proximaParada = pista.proximaParada(Onibus.parada);
				int embarcar = pista.pararEmbarcar();
				synchronized (Onibus.parada) {
					// proximaParada.getId();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("O onibus do tipo: " + tipo + " Está indo para a parada... "
							+ String.valueOf(proximaParada.getId()) + " Com o total de " + embarcar
							+ " Pessoas.");
				}
				if(embarcar > Onibus.capMax) {
					System.out.println("O onibus do tipo "+tipo+" LOTOU!!!");
					System.out.println();
				}
			}
		} while (this.pista.paradas.size() < 0);
	}
}