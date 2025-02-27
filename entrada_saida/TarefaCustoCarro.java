import javax.swing.JOptionPane;

public class TarefaCustoCarro{
    public static void main(String[] args){
        //declaração de variáveis
        double a, resultado;
        //entrada de dados
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de fábrica do carro:"));
        //processamento
        resultado = a + (a * .28) + (a * .45);
        //saída
        JOptionPane.showMessageDialog(null, resultado);
    }
}