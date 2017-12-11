// @Author: Hermyson Cassiano 
package cap8.questao8_10;

public class TesteSemaforo {
	public TesteSemaforo() {
		
	}

	public static void main(String[] args){
		System.out.println("Vermelho " + Semaforo.VERMELHO.getSegundos() + " Segundos");
		System.out.println("Verde " + Semaforo.VERDE.getSegundos() + " Segundos");
		System.out.println("Amarelo " + Semaforo.AMARELO.getSegundos() + " Segundos");
	}
	
}
