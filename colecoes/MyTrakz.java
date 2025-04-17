package colecoes;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

class OrganizaPorAvaliacao implements Comparator<Track> {
    public int compare(Track track1, Track track2){
        
        if(track1.getAvaliacao() > track2.getAvaliacao()) return -1;
        if(track1.getAvaliacao() < track2.getAvaliacao()) return 1;
        return track1.compareTo(track2);
    }
}

class Track implements Comparable<Track> {
    private String titulo;
    private int avaliacao;
    public Track(String titulo, int avaliacao){
        this.titulo = titulo;
        this.avaliacao = avaliacao;
    }
    public Track(String titulo){
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAvaliacao(){
        return this.avaliacao;
    }
    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
        return;
    }

    @Override
    public boolean equals (Object obj) {
        var outraTrack = (Track)obj;
        return this.titulo.equals(outraTrack.titulo);
    }
    public int compareTo(Track outraTrack){
        return this.titulo.compareTo(outraTrack.titulo);
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
                {
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    minhasTracks.add(new Track(titulo));
                    JOptionPane.showMessageDialog(null, "Track adicionada");
                    break;
                }
                case 2:
                {
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    var desejada = new Track(titulo);
                    if(!minhasTracks.contains(desejada)) JOptionPane.showMessageDialog(null, "Musica nao encontrada");
                    else
                    {
                        minhasTracks.remove(desejada);
                        JOptionPane.showMessageDialog(null, "Musica removida!");
                    }
                    break;
                }
                case 3:
                {
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    var desejada = new Track(titulo);
                    var posicao = minhasTracks.indexOf(desejada);
                    if(posicao == -1) JOptionPane.showMessageDialog(null, "Musica nao encontrada");
                    else
                    {
                        var novoTitulo = JOptionPane.showInputDialog("Novo titulo?");
                        minhasTracks.get(posicao).setTitulo(novoTitulo);
                        JOptionPane.showMessageDialog(null, "Musica atuaizada!");
                    }
                    break;
                }
                case 4:
                {
                    if(minhasTracks.isEmpty()) System.out.println("Lista vazia!");
                    else
                    {
                        Collections.sort(minhasTracks);
                        JOptionPane.showMessageDialog(null, minhasTracks);                    
                    }
                    break;
                }
                case 5:
                {
                    if(minhasTracks.isEmpty()) System.out.println("Lista vazia!");
                    else
                    {
                        Collections.sort(minhasTracks, new OrganizaPorAvaliacao());
                        JOptionPane.showMessageDialog(null, minhasTracks);                    
                    }
                    break;
                }
                case 6:
                {
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    var desejada = new Track(titulo);
                    var posicao = minhasTracks.indexOf(desejada);
                    if(posicao == -1) JOptionPane.showMessageDialog(null, "Musica nao encontrada");
                    else
                    {
                        var avaliacao = Integer.parseInt(JOptionPane.showInputDialog("Nota?"));
                        minhasTracks.get(posicao).setAvaliacao(avaliacao);
                        JOptionPane.showMessageDialog(null, "Musica avaliada!");
                    }
                }
                case 0:
                {
                    JOptionPane.showMessageDialog(null, "Xau!");
                    break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null, "Opcao invalida!");
                    break;
                }
            }
        } while(op !=0);
    }
}
