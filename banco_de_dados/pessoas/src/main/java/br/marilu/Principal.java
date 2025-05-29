package br.marilu;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        var menu = "1-Cadastrar\n2-Atualizar\n3-Remover\n4-Listar\n0-Sair";
        int op;
        do
        {
            op = Integer.parseInt((JOptionPane.showInputDialog(menu)));
            switch(op)
            {
                case 1:
                {
                    try
                    {
                        var nome = JOptionPane.showInputDialog("Nome:");
                        var fone = JOptionPane.showInputDialog("Fone:");
                        var email = JOptionPane.showInputDialog("E-mail:");
                        var pessoa = new Pessoa(nome, fone, email);
                        var dao = new PessoaDAO();
                        dao.cadastrar(pessoa);
                        JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
                    } 
                    catch(Exception e)
                    {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Tente novamente mais tarde!");
                    }
                    break;
                }
                case 2:
                {
                    try
                    {
                        var nome = JOptionPane.showInputDialog("Nome:");
                        var fone = JOptionPane.showInputDialog("Fone:");
                        var email = JOptionPane.showInputDialog("E-mail:");
                        var cod = Integer.parseInt(JOptionPane.showInputDialog("Codigo:"));
                        var pessoa = new Pessoa(cod, nome, fone, email);
                        var dao = new PessoaDAO();
                        dao.atualizar(pessoa);
                        JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!");
                    } 
                    catch(Exception e)
                    {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Tente novamente mais tarde!");
                    }
                    break;
                }
                case 3:
                {
                    try
                    {
                        var cod = Integer.parseInt(JOptionPane.showInputDialog("Codigo:"));
                        var pessoa = new Pessoa(cod);
                        var dao = new PessoaDAO();
                        dao.remover(pessoa);
                        JOptionPane.showMessageDialog(null, "Remoção feita com sucesso!");
                    } 
                    catch(Exception e)
                    {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Tente novamente mais tarde!");
                    }
                    break;
                }
                case 4:
                {
                    try
                    {
                        var sb = new StringBuilder("");
                        for (Pessoa p : new PessoaDAO().listar())
                        {
                            sb.append(p).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb);
                    } 
                    catch(Exception e)
                    {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Tente novamente mais tarde!");
                    }
                    break;
                }
            }
        }
        while(op != 0);
    }
}
