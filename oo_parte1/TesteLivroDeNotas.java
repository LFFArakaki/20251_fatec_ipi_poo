public class TesteLivroDeNotas{
    public static void main(String [] args){
        LivroDeNotas livroDeNotas = new LivroDeNotas("POO");
        LivroDeNotas livroDeNotas2 = new LivroDeNotas("BD");

        System.out.println(livroDeNotas.getNomeDaDisciplina());
        livroDeNotas.setNomeDaDisciplina("BD");
        livroDeNotas.exibirMensagem();

        System.out.println(livroDeNotas2.getNomeDaDisciplina());
        livroDeNotas2.setNomeDaDisciplina("POO");
        livroDeNotas2.exibirMensagem();
    }
}
