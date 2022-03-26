package dao;
import model.Cliente;
import utils.JDBCultil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    public Cliente salvarProduto(Cliente cliente) throws SQLException {
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

        } catch (SQLException e) {

            System.out.println("Falha ao tentar salvar o cliente");

        }

        //Bloco de pesquisa usando o ID

        public Cliente pesquisar(long id){

            Connection conexao = null;

            String sql1 = "SELECT * FROM cliente WHERE id=?";

            PreparedStatement ps2 = conexao.prepareStatement(sql1);

            ps2.setLong(1, 1l);
            ResultSet resultSet = ps2.executeQuery();

            try {

                if (resultSet.next()) {
                    Cliente clientePesquisado = new Cliente();

                    clientePesquisado.setId(resultSet.getLong("id"));
                    clientePesquisado.setNome(resultSet.getString("nome"));
                    clientePesquisado.setNumero(resultSet.getInt("numero"));
                    clientePesquisado.setBairroEntrega1(resultSet.getString("bairro_de_entrega_1"));
                    clientePesquisado.setBairroEntrega2(resultSet.getString("bairro_de_entrega_2"));
                    clientePesquisado.setBairroEntrega3(resultSet.getString("bairro_de_entrega_3"));
                    clientePesquisado.setBairroEntrega4(resultSet.getString("bairro_de_entrega_4"));
                    clientePesquisado.setBairroEntrega5(resultSet.getString("bairro_de_entrega_5"));
                    clientePesquisado.setDataAniversario(resultSet.getString("data_aniverrsario"));
                    clientePesquisado.setDataAniversarioParente(resultSet.getString("data_aniversario_parente"));
                    clientePesquisado.setDataAniversarioParente2(resultSet.getString("data_aniversario_parente2"));

                    ps2.execute();

                    conexao.close();
                    return clientePesquisado;
                }

            } catch (SQLException e) {

                System.out.println("Falha ao pesquisar cliente");

            }
        }
    }
}