// @Author: Hermyson Cassiano 
package cap8.questao8_18;

import java.math.BigDecimal;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create two Account objects
		Account account1 = new Account("Pedro", new BigDecimal(1000.00));
		Account account2 = new Account("Jose", new BigDecimal(2000.00));
		account1.deposito(new BigDecimal(600.00));
		account1.saca(new BigDecimal(100.00));
		System.out.println("Nome:" + account1.getName());
		System.out.println("Saldo: " + account1.getBalance());
		account2.deposito(new BigDecimal(100.00));
		account2.saca(new BigDecimal(50.0));
		System.out.println("Nome: "+ account2.getName()+ "\nSaldo: "+ account2.getBalance());
		
	}

}
