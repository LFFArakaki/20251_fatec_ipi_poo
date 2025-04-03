package colecoes;

import java.util.Random;

public class TesteVetorDinamicoV1 {
    public static void main(String[] args) throws Exception {
        var v = new VetorDinamico();
        var rand = new Random();

        while(true)
        {
            var a = rand.nextInt(1,7);
            v.adicionar(a);
            System.out.println(v);
            System.out.println("***********************");
            Thread.sleep(5000);
        }

    }
}
