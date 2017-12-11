// @Author: Hermyson Cassiano 
package cap8.questao8_10;

public enum Semaforo {

	VERMELHO(50), 
	VERDE(40), 
	AMARELO(5);
	
	private int segundos;

	Semaforo(int segundos) {
		this.setSegundos(segundos);
		
	}
	public  int getSegundos(){
		return this.segundos;
	}
	public void setSegundos(int segundos){
		this.segundos = segundos;
	}

}
