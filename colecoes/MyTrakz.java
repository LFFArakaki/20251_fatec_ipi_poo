package colecoes;

import java.util.ArrayList;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

class Track{
    private String titulo;
    private int avaliacao;
    public Track(String titulo, int avaliacao){
        this.titulo = titulo;
        this.avaliacao = avaliacao;
    }
    public Track(String titulo){
        this.titulo = titulo;
    }
    public String toString(){
        return String.format("Titulo: %s, Avaliacao: %d",titulo, avaliacao);
    }
}
public class MyTrakz {
    public static void main(String[] args) {
        var minhasTracks = new ArrayList<Track>();
        var menu = "1-Cadastrar\n2-Remover\n3-Atualizar\n4-Listar ordenado por nome\n5-Listar ordenado por avaliacao\n6-Avaliar\n0-sair";
        int op;

        do
        {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op)
            {
                case 1:
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    minhasTracks.add(new Track(titulo));
                    JOptionPane.showMessageDialog(null, "Track adicionada");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        } while(op !=0);
    }
}
