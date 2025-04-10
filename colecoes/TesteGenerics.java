package colecoes;

class Musica{
    String nome;
}
public class TesteGenerics {
    public static void main(String[] args) {
        var ints = new VetorDinamico<Integer>();
        var songs = new VetorDinamico<Musica>();
    }
}
