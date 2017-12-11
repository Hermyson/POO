
package cap8.questao8_17;

public class TicTacToe {

	public enum Cell {
		E, X, O
	};

	private Cell[][] tabuleiro;

	public TicTacToe() {
		this.tabuleiro = new Cell[3][3];
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = Cell.E;
			}
		}
	}

	public String toString() {
		String retorno = "";
		retorno += " | " + tabuleiro[0][0] + "  " + tabuleiro[0][1] + "  " + tabuleiro[0][2] + " |\n";
		retorno += " | " + tabuleiro[1][0] + "  " + tabuleiro[1][1] + "  " + tabuleiro[1][2] + " |\n";
		retorno += " | " + tabuleiro[2][0] + "  " + tabuleiro[2][1] + "  " + tabuleiro[2][2] + " |\n";

		return retorno;

	}

	// checa
	public boolean checaLinhas() {
		for (int linha = 0; linha < 3; linha++) {
			if ((tabuleiro[linha][0] == Cell.X && tabuleiro[linha][1] == Cell.X && tabuleiro[linha][2] == Cell.X))
				System.out.println("Ganhador X!");
			if ((tabuleiro[linha][0] == Cell.O && tabuleiro[linha][1] == Cell.O && tabuleiro[linha][2] == Cell.O))
				System.out.println("Ganhador O!");
		}
		return true;
	}

	public boolean checaColunas() {

		for (int coluna = 0; coluna < 3; coluna++) {
			if ((tabuleiro[0][coluna] == Cell.X && tabuleiro[1][coluna] == Cell.X && tabuleiro[2][coluna] == Cell.X))
				System.out.println("Ganhador X!");
			if ((tabuleiro[0][coluna] == Cell.O && tabuleiro[1][coluna] == Cell.O && tabuleiro[2][coluna] == Cell.O))
				System.out.println("Ganhador O!");

		}
		return true;
	}

	public boolean checaDiagonais() {
		for (int coluna = 0; coluna < 3; coluna++) {
			if ((tabuleiro[0][0] == Cell.X && tabuleiro[1][1] == Cell.X && tabuleiro[2][2] == Cell.X))

				if ((tabuleiro[0][0] == Cell.X && tabuleiro[1][1] == Cell.X && tabuleiro[2][2] == Cell.X))
					System.out.println("Ganhador X!");
			if ((tabuleiro[0][2] == Cell.O && tabuleiro[1][1] == Cell.O && tabuleiro[2][0] == Cell.O))

				if ((tabuleiro[0][2] == Cell.O && tabuleiro[1][1] == Cell.O && tabuleiro[2][0] == Cell.O))
					System.out.println("Ganhador O!");
		}
		return true;
	}

	public void setCell(int row, int col, Cell value) {

		tabuleiro[row][col] = value;
	}

}