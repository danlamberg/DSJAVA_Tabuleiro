public class Tabuleiro {

    private char[][] tabuleiro;
    private Jogador jogador;

    public Tabuleiro() {
        this.tabuleiro = new char[10][10];
        // Inicializar o tabuleiro com pontos (representando espaços vazios)
        for (int lin = 0; lin < 10; lin++) {
            for (int col = 0; col < 10; col++) {
                tabuleiro[lin][col] = '.';
            }
        }
    }

    public void posicionarJogador(Jogador jogador) {
        this.jogador = jogador;
        tabuleiro[jogador.getPosicaoX()][jogador.getPosicaoY()] = jogador.getSimbolo().charAt(0);
    }

    public void imprimirTabuleiro() {
        for (int lin = 0; lin < 10; lin++) {
            for (int col = 0; col < 10; col++) {
                System.out.print("[ " + tabuleiro[lin][col] + " ]");
            }
            System.out.println();
        }
    }
}