import java.util.Random;

public class JogoV2 {
    public static void main(String[] args) throws Exception {

        var personagem = new Personagem("Klebinho");
        var rand = new Random();

        while(true)
        {
            var acao = rand.nextInt(3)+1;
            switch(acao)
            {
                case 1:
                personagem.cacar();
                break;
                case 2:
                personagem.comer();
                break;
                case 3:
                personagem.dormir();
                break;
            }
            personagem.mostrarAtributos();
            Thread.sleep(5000);
        }
    }
}
