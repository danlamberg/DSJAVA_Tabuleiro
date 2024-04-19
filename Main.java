import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        // Solicita a posição do jogador 1
        System.out.println("Posição jogador 1:");
        System.out.print("Digite a posição X: ");
        int posX1 = leitor.nextInt();
        System.out.print("Digite a posição Y: ");
        int posY1 = leitor.nextInt();

        // Solicita a posição do jogador 2
        System.out.println("Posição jogador 2:");
        System.out.print("Digite a posição X: ");
        int posX2 = leitor.nextInt();
        System.out.print("Digite a posição Y: ");
        int posY2 = leitor.nextInt();

        // Verifica se as posições são diferentes
        if (posX1 == posX2 && posY1 == posY2) {
            System.out.println("Erro: As posições dos jogadores não podem ser iguais. Por favor, escolha posições diferentes para o jogador 2.");
            return; // Termina o programa
        }

        // Cria os objetos Jogador
        Jogador jogador1 = new Jogador(posX1, posY1, "X");
        Jogador jogador2 = new Jogador(posX2, posY2, "O");
        
        // Cria o tabuleiro
        Tabuleiro tabuleiro = new Tabuleiro();

        // Posiciona os jogadores no tabuleiro
        tabuleiro.posicionarJogador(jogador1);
        tabuleiro.posicionarJogador(jogador2);

        // Imprime o tabuleiro
        tabuleiro.imprimirTabuleiro();
    }
}