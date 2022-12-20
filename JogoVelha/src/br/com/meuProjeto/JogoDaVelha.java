package br.com.meuProjeto;
import java.util.Scanner;
public class JogoDaVelha {

	private static final int SIZE = 3; 
    private static final char X = 'X'; 
    private static final char O = 'O'; 

    private static char[][] tabuleiro; 
    private static char jogadorAtual; 

    public static void main(String[] args) {
        tabuleiro = new char[SIZE][SIZE]; 

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        jogadorAtual = X; 

        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimirTabuleiro();

            System.out.print("Jogador " + jogadorAtual + ", escolha uma linha (1, 2 ou 3): ");
            int linha = scanner.nextInt() - 1;
            System.out.print("Jogador " + jogadorAtual + ", escolha uma coluna (1, 2 ou 3): ");
            int coluna = scanner.nextInt() - 1;

            if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posição já ocupada! Escolha outra posição.");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;

            if (verificarVitoria(linha, coluna)) {
                System.out.println("Jogador " + jogadorAtual + " ganhou!");
                break;
            }

            if (verificarEmpate()) {
                System.out.println("Jogo empatado!");
                break;
            }

            jogadorAtual = (jogadorAtual == X) ? O : X;
        }

        scanner.close();
    }

    private static boolean verificarEmpate() {
		return false;
	}

	private static boolean verificarVitoria(int linha, int coluna) {
		return false;
	}

	private static void imprimirTabuleiro() {
	    for (int i = 0; i < SIZE; i++) {
	        for (int j = 0; j < SIZE; j++) {
	            System.out.print(tabuleiro[i][j] + " | ");
	        }
	        System.out.println();
	        System.out.println("---------");
	        
	    }
    }
}
