// @Author: Hermyson Cassiano 
package cap11.questao11_21;

public class ExcecoesComEscoposTest {
	public static void main(String[] args){
		try {
			 ExcecoesComEscoposExternos s = new ExcecoesComEscoposExternos("0"); 
			 System.out.println(s.a);
		} catch (NumberFormatException nfe) {
			System.out.println("Oops");
		}
	}
}

