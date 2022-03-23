package dao;
import model.Cliente;
import utils.JDBCultil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    public void salvarProduto(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente" +
                "(nome, numero, bairro_de_entrega_1, bairro_de_entrega_2, bairro_de_entrega_3, bairro_de_entrega_4," +
                " bairro_de_entrega_5, data_aniverrsario, data_aniversario_parente, data_aniversario_parente2)" +
                " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    try {
        Connection conexao = JDBCultil.criarConexao();

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setInt(2, cliente.getNumero());
        ps.setString(3, cliente.getBairroEntrega1());
        ps.setString(4, cliente.getBairroEntrega2());
        ps.setString(5, cliente.getBairroEntrega3());
        ps.setString(6, cliente.getBairroEntrega4());
        ps.setString(7, cliente.getBairroEntrega5());
        ps.setString(8, cliente.getDataAniversario());
        ps.setString(9, cliente.getDataAniversarioParente());
        ps.setString(10, cliente.getDataAniversarioParente2());

        ps.execute();
        ps.close();

        conexao.close();

            System.out.println("Cliente Salvo com sucesso");
        }catch (SQLException e){
            System.out.println("Falha ao tentar salvar o cliente");
    }
    }
}
