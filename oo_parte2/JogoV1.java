public class JogoV1 {
    
    public static void main(String[] args) {
        var personagem1 = new Personagem("Klebinho");
        
        personagem1.mostrarAtributos();
        personagem1.cacar();
        personagem1.mostrarAtributos();
        personagem1.comer();
        personagem1.mostrarAtributos();
        personagem1.dormir();
        personagem1.mostrarAtributos();
    }
}