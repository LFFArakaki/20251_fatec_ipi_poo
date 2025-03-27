import java.util.Random;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class JogoV2 {
    public static void main(String[] args) throws Exception {

        var rand = new Random();
        var personagem = new Personagem();
        var personagem2 = new Personagem("Lebron", 10, 10, 0);
        var personagem3 = new Personagem("Soneca", 4, 4, 10);
        Personagem [] personagens = {personagem, personagem2, personagem3};
        Class<?> classe = Personagem.class;
        Method [] metodos = classe.getDeclaredMethods();
        int numeroDeMetodos = 0;

        for (Method metodo : metodos) {
            if (Modifier.isPublic(metodo.getModifiers()) && !metodo.getName().equals("toString")) {
                numeroDeMetodos++;
            }
        }

        System.out.println(numeroDeMetodos);

        while(true)
        {
            var jogador = rand.nextInt(personagens.length);
            var acao = rand.nextInt(numeroDeMetodos)+1;
            switch(acao)
            {
                case 1:
                personagens[jogador].cacar();
                break;
                case 2:
                personagens[jogador].comer();
                break;
                case 3:
                personagens[jogador].dormir();
                break;
                default:
                System.out.println("Acao invalida!");
            }
            System.out.println(personagens[jogador]);
            System.out.println("**********************");
            Thread.sleep(5000);
        }
    }
}
