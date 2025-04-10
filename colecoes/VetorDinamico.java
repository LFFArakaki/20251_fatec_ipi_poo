package colecoes;

public class VetorDinamico{
    private static final int LIMIAR_INFERIOR = 4;
    private int capacidade;
    private int quantidade;
    private int[] elementos;

    public VetorDinamico(){
        this.capacidade = LIMIAR_INFERIOR;
        this.quantidade = 0;
        this.elementos = new int[this.capacidade];
    }

    public void adicionar(int elemento){
        if(checarCheio()) redimensionar(this.capacidade*2);
        this.elementos[this.quantidade++] = elemento;
    }
    public void remover(int elemento){
        if(checarVazio()) return;
        this.elementos[elemento] = 0;
        for(int i = elemento;i<quantidade-1;i++) trocarElemento(i, i+1);
        this.quantidade--;
        if(this.quantidade == this.capacidade/4 && this.capacidade > LIMIAR_INFERIOR) redimensionar(this.capacidade/2);
    }
    private void redimensionar(int capacidade){
        var aux = new int[capacidade];
        for(int i=0;i<this.quantidade;i++) aux[i] = this.elementos[i];
        this.elementos = aux;
        this.capacidade = capacidade;
    }
    public boolean checarCheio(){
        return this.quantidade == this.capacidade;
    }
    public boolean checarVazio(){
        return this.quantidade == 0;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    private void trocarElemento(int elementoA, int elementoB){
        int temp = this.elementos[elementoA];
        this.elementos[elementoA] = this.elementos[elementoB];
        this.elementos[elementoB] = temp;
    }

    public String toString(){
        var sb = new StringBuilder("");
        sb.append("Capacidade: ").append(this.capacidade).append("\n");
        sb.append("Quantidade: ").append(this.quantidade).append("\n");
        for(int i=0;i<this.quantidade;i++) sb.append(this.elementos[i]).append(i != this.quantidade-1 ? " " : "");

        return sb.toString();
    }
}