import javax.swing.JOptionPane;

public class SomaDoisNumeros{
    public static void main(String[] args){
        //declaração de variáveis
        double a, b, resultado;
        //entrada de dados
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        //processamento
        resultado = a + b;
        //saída
        JOptionPane.showMessageDialog(null, resultado);
    }
}