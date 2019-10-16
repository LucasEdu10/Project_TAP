package SIMULACAO;

public class CorredorOnibus {

	public static void main(String[] args) {

		Pista pista = new Pista();
		Parada parada1 = new Parada(0, 1, "Parada onibus 1");
		Parada parada2 = new Parada(1, 2, "Parada onibus 2");
		Parada parada3 = new Parada(2, 3, "Parada onibus 3");
		//Parada parada4 = new Parada(3, 4, "Parada onibus 4");

		pista.adicionarParada(parada1);
		pista.adicionarParada(parada2);
		pista.adicionarParada(parada3);
		//pista.adicionarParada(parada4);
		
		//pista.pararEmbarcar(0);
		
		Onibus B1 = new Onibus(1, "Micro", 8, pista, parada1);
		Onibus B2 = new Onibus(2, "Medio", 30, pista, parada1);

		B1.setParada(parada1);
		B2.setParada(parada1);

		Thread thread1 = new Thread(B1);
		Thread thread2 = new Thread(B2);
		thread1.start();
		thread2.start();
		
		do {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				System.out.println("Foi interrompida.");
			}
		}while(thread1.isAlive() || thread2.isAlive());
		System.out.println("============ PROGRAMA FINALIZADO ============");
		
	}

}