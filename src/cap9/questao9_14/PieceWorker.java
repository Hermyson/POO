// @Author: Hermyson Cassiano 
package cap9.questao9_14;

public class PieceWorker extends Employee {
	private double wage; // wage per piece
	private double pieces; // number of pieces produced

	//
	public PieceWorker(String first, String last, String ssn, double Wage, double Pieces) {
		super(first, last, ssn);
		setWage(Wage);
		setPieces(Pieces);
	}

	public final void setWage(double Wage) {
		wage = (Wage < 0.0) ? 0.0 : Wage;
	}

	public double getWage() {
		return wage;
	}

	public final void setPieces(double Pieces) {
		pieces = ((Pieces >= 0.0) && (Pieces <= 168.0)) ? Pieces : 0.0;
	}

	public double getPieces() {
		return pieces;
	}

	public double earnings() {
		return getWage() * getPieces();
	}

	public String toString() {
		return String.format("Piece Worker: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "Wage per piece", getWage(),
				"Number of pieces produced", getPieces());
	} 

}
