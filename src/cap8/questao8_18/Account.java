// @Author: Hermyson Cassiano 
package cap8.questao8_18;

import java.math.BigDecimal;

public class Account {

	private String name; // instance variable
	private BigDecimal balance;

	// constructor initializes name with parameter name
	public Account(String name, BigDecimal balance) {
		this.name = name;
		this.balance = balance;

	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;

	}

	// method to set the name
	public void setName(String name) {
		this.name = name;
	}

	// method to retrieve the name
	public String getName() {
		return name;
	}

	public void saca(BigDecimal a) {
		this.balance = balance.subtract(a);

	}

	public void deposito(BigDecimal a) {
		this.balance = balance.add(a);

	}

}
