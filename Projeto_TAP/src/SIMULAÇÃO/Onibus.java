package SIMULAÇÃO;

public class Onibus implements Runnable{
	
	private int qPessoas;
	private String tipo;
	int temp;
	boolean anda;
	
	public Onibus(String tipo, int qPessoas, int temp) {
		this.tipo = tipo;
		this.qPessoas = qPessoas;
		this.temp = temp;
		Thread B = new Thread(this);
		B.start();
	}
	
	synchronized void andar(boolean Andando) {
		if(!Andando) {
			anda = true;
			notify();
			return;
		}
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
		System.out.println(tipo+ " Onibus partindo...");
		System.out.println(" ");
		for(int i =1; i < 5; i++) {
			qPessoas++;
			System.out.println("Onibus do tipo: "+tipo+" Parou na parada: "+i);
			//System.out.println("TIPO: "+tipo+"\n"
				//	+ "Quantidade de pessoas: "+qPessoas);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
