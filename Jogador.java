public class Jogador {

    private int posicaoX;
    private int posicaoY;
    private String simbolo;

    public Jogador(int x, int y, String simbolo) {
        this.posicaoX = x;
        this.posicaoY = y;
        this.simbolo = simbolo;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setPosicao(int x, int y) {
        this.posicaoX = x;
        this.posicaoY = y;
    }
}
