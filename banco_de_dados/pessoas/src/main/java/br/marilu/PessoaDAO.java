package br.marilu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    public void cadastrar(Pessoa pessoa) throws Exception {
        var sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES(?, ?, ?)";
        var c = ConnectionFactory.obterConexao();

        var ps = c.prepareStatement(sql);
        ps.setString(1, pessoa.getNome());
        ps.setString(2, pessoa.getFone());
        ps.setString(3, pessoa.getEmail());
        ps.execute();

        ps.close();
        c.close();
    }
    public void atualizar(Pessoa pessoa) throws Exception {
        var sql = "UPDATE tb_pessoa SET nome=?, fone=?, email=? WHERE cod_pessoa=?";

        try(
            var c = ConnectionFactory.obterConexao();
            var ps = c.prepareStatement(sql)
            )
        {
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getFone());
            ps.setString(3, pessoa.getEmail());
            ps.setInt(4, pessoa.getCodigo());
            ps.execute();
        }
    }
    public void remover(Pessoa pessoa) throws Exception {
        var sql = "DELETE FROM tb_pessoa WHERE cod_pessoa=?";

        try(
            var c = ConnectionFactory.obterConexao();
            var ps = c.prepareStatement(sql)
            )
        {
            ps.setInt(1, pessoa.getCodigo());
            ps.execute();
        }
    }
    public List<Pessoa> listar() throws Exception {
        var pessoas = new ArrayList<Pessoa>();
        var sql = "SELECT * FROM tb_pessoa";

        try(
            var c = ConnectionFactory.obterConexao();
            var ps = c.prepareStatement(sql);
            var rs = ps.executeQuery();      
        )
        {
            while(rs.next())
            {
                var codigo = rs.getInt("cod_pessoa");
                var nome = rs.getString("nome");
                var fone = rs.getString("fone");
                var email = rs.getString("email");
                var pessoa = new Pessoa(codigo, nome, fone, email);
                pessoas.add(pessoa);

            }
            return pessoas;
        }
    }
}
