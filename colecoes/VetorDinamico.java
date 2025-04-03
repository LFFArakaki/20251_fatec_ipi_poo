package colecoes;

public class VetorDinamico {
    private static final int LIMIAR_INFERIOR = 4;
    private int [] elementos;
    private int quantidade;
    private int capacidade;

    VetorDinamico(){
        quantidade = 0;
        capacidade = LIMIAR_INFERIOR;
        elementos = new int[capacidade];
    }

    public void adicionar(int e){
        elementos[quantidade++] = e;
    }

    public void aumentar(){

    }

    public String toString(){
        var sb = new StringBuilder("");
        sb.append("Quantidade: ").append(quantidade).append("\n");
        sb.append("Capacidade: ").append(capacidade).append("\n");
        for(int i=0;i<quantidade;i++) sb.append(elementos[i]).append(i != quantidade-1 ? " " : "");

        return sb.toString();
    }
}
