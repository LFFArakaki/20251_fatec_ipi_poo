package colecoes;

import java.util.Random;

public class TesteVetorDinamicoV1 {
    public static void main(String[] args) throws Exception {
        var vetor = new VetorDinamico();
        var rand = new Random();

        while(true)
        {
            var escolha = rand.nextDouble();
            var numero = rand.nextInt(1,7);
            var posicao = vetor.getQuantidade() == 0 ? 0 : rand.nextInt(vetor.getQuantidade());
            if(escolha <= 0.5) vetor.adicionar(numero);
            else vetor.remover(posicao);
            System.out.println(vetor);
            System.out.println("***********************");
            Thread.sleep(5000);
        }
    }
}
