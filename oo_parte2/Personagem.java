class Personagem{
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    public Personagem(String nome){
        this.nome = nome;
    }

    void cacar(){
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
    void comer(){
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
    void dormir(){
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

    void mostrarAtributos(){
        System.out.printf("Energia: %d\nFome: %d\nSono: %d\n\n",energia, fome, sono);
    }
}