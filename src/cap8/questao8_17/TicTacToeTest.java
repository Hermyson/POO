package cap8.questao8_17;

import java.util.Scanner;

import cap8.questao8_17.TicTacToe.Cell;

public class TicTacToeTest {
	public static void main(String[] args) {

		TicTacToe tabuleiro = new TicTacToe();

		Scanner scan = new Scanner(System.in);

		boolean continuar = true;
		boolean houveVencedor = false;
		boolean houveEmpate = false;

		System.out.println("Bem vindo ao Tic Tac Toe!");
		System.out.println("Primeiro joga o X.");

		int linha = 0;
		int coluna = 0;

		boolean jogadaInvalida = false;
		while (continuar) {
			do {
				System.out.print("Jogada do X. Informe linha: ");
				linha = scan.nextInt();

				System.out.print("Jogada do X. Informe coluna: ");
				coluna = scan.nextInt();

				if (tabuleiro.posicaoVazia(linha, coluna)) {
					tabuleiro.setCell(linha, coluna, Cell.X);
					jogadaInvalida = false;
				} else {
					System.out.print("Jogada invalida. Tente novamente.");
					jogadaInvalida = true;
				}
			} while (jogadaInvalida);

			System.out.println(tabuleiro.toString());
			if (tabuleiro.checaLinhas() && houveVencedor || tabuleiro.checaColunas() && houveVencedor
					|| tabuleiro.checaDiagonais() && houveVencedor) {
				houveVencedor = true;
			}
			do {
				System.out.print("Jogada do O. Informe linha: ");
				linha = scan.nextInt();

				System.out.print("Jogada do O. Informe coluna: ");
				coluna = scan.nextInt();
				
				if (tabuleiro.posicaoVazia(linha, coluna)) {
					tabuleiro.setCell(linha, coluna, Cell.O);
					jogadaInvalida = false;
				} else {
					System.out.print("Jogada invalida. Tente novamente.");
					jogadaInvalida = true;
				}
			} while (jogadaInvalida);

			System.out.println(tabuleiro.toString());
			if (tabuleiro.checaLinhas() && houveVencedor || tabuleiro.checaColunas() && houveVencedor
					|| tabuleiro.checaDiagonais() && houveVencedor) {
				houveVencedor = true;
				System.out.println(houveVencedor);
			}

			continuar = !houveEmpate && !houveVencedor;

		}
	}
}
