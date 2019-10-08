package SIMULACAO;

public class CorredorOnibus {

	public static void main(String[] args) {

		Pista pista = new Pista();
		Parada parada1 = new Parada(0, 1, "Parada onibus 1");
		Parada parada2 = new Parada(1, 4, "Parada onibus 2");
		Parada parada3 = new Parada(2, 5, "Parada onibus 3");

		pista.adicionarParada(parada1);
		pista.adicionarParada(parada2);
		pista.adicionarParada(parada3);

		Onibus B1 = new Onibus("Micro", 0, pista, parada1);
		Onibus B2 = new Onibus("Medio", 0, pista, parada1);

		B1.setParada(parada1);
		B2.setParada(parada2);

		Thread thread1 = new Thread(B1);
		Thread thread2 = new Thread(B2);
		thread1.start();
		thread2.start();
	}

}