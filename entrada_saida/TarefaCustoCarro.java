import java.util.Scanner;

public class TarefaCustoCarro{
    public static void main(String[] args){
        //declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        double a, resultado;
        //entrada de dados
        System.out.println("Digite o valor de fábrica do carro:");
        a = leitor.nextDouble();
        //processamento
        resultado = a + (a * .28) + (a * .45);
        //saída
        System.out.printf("Valor = %f", resultado);
    }
}