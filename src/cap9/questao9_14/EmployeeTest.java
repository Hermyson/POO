// @Author: Hermyson Cassiano 
package cap9.questao9_14;

public class EmployeeTest {

	public static void main(String[] args) {

		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Jose", "Silva",
				"111111111", 5000, 4, 300);
		SalariedEmployee salariedEmployee = new SalariedEmployee("Joao", "Vicente", "111-11-1111", 800.00);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Pedro", "Oliveira", "333-33-3333", 10000, .06);
		PieceWorker pieceWorker = new PieceWorker("Rafael", "Souza", "777-223-987", 213, 16);

	}
}
