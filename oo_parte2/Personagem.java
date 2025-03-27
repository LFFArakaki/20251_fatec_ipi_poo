import java.util.Random;

public class Personagem{

    private String nome;
    private String [] possiveisNomes = {"Steve", "Alex", "John"};
    private int energia;
    private int fome;
    private int sono;

    public Personagem(String nome, int energia, int fome, int sono){
        this.nome = nome.length() < 4 ? nomeAleatorio() : nome;
        this.energia = energia < 0 || energia > 10 ? 10 : energia;
        this.fome = fome < 0 || fome > 10 ? 0 : fome;
        this.sono = sono < 0 || sono > 10 ? 0 : sono;
    }

    public Personagem(){
        this.nome = nomeAleatorio();
        this.energia = 10;
        this.fome = 0;
        this.sono = 0;
    }

    private String nomeAleatorio(){
        var rand = new Random();
        return this.possiveisNomes[rand.nextInt(possiveisNomes.length)];
    }
    public void cacar(){
        if(energia < 2)
        {
            System.out.println("Sem energia para cacar!");
        }
        else
        {
            System.out.printf("%s cacando\n",nome);
            energia = energia-2;
        }

        sono = sono < 10 ? sono+1 : sono;
        fome = fome < 10 ? fome+1 : fome;
    }
    public void comer(){
        if(fome < 1)
        {
            System.out.println("Nao esta com fome!");
        }
        else
        {
            System.out.printf("%s comendo\n",nome);
            fome--;
            energia = energia < 10 ? energia+1 : energia;
        }
    }
    public void dormir(){
        if(sono < 1)
        {
            System.out.println("Nao esta com sono!");
        }
        else
        {
            System.out.printf("%s dormindo\n",nome);
            sono--;
            energia = energia < 10 ? energia+1 : energia;
        }
    }
    
    public String toString()
    {
        return String.format(
            "%s\nEnergia: %d\nFome: %d\nSono: %d"
            ,nome, energia, fome, sono
        );
    }
    //void mostrarAtributos(){
    //    System.out.printf("Energia: %d\nFome: %d\nSono: %d\n\n",energia, fome, sono);
    //}
}