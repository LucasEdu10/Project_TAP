package SIMULACAO;

public class CorredorOnibus {

	public static void main(String[] args) {

		Pista pista = new Pista();

		pista.adicionarParada(Onibus.parada1);
		pista.adicionarParada(Onibus.parada2);
		pista.adicionarParada(Onibus.parada3);
		pista.adicionarParada(Onibus.parada4);
		pista.adicionarParada(Onibus.parada5);
		
		Onibus B1 = new Onibus(1, "Micro", 8, pista, Onibus.parada1);
		Onibus B2 = new Onibus(2, "Medio", 30, pista, Onibus.parada1);

		B1.setParada(Onibus.parada1);
		//B2.setParada(Onibus.parada1);

		Thread thread1 = new Thread(B1);
		//Thread thread2 = new Thread(B2);
		thread1.start();
		//thread2.start();
		
		do {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				System.out.println("Foi interrompida.");
			}
		}while(thread1.isAlive() );//|| thread2.isAlive());
		System.out.println("============ PROGRAMA FINALIZADO ============");
		
	}

}