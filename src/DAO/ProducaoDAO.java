package dao;

import model.Producao;
import utils.JDBCultil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProducaoDAO {

    public void salvarPedido(Producao producao) throws SQLException {
        String sql = "INSERT INTO public.producao(\n" +
                "\tcliente_id, pedido, valor, valor_pago, valor_a_pagar, metodo_de_pagamento, data_entrega)\n" +
                "\tVALUES (?, ?, ?, ?, ?, ?, ?);";

        try{
            Connection conexao = JDBCultil.criarConexao();

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setLong(1, producao.getClienteId());
            ps.setString(2,producao.getPedido());
            ps.setDouble(3,producao.getValor());
            ps.setDouble(4,producao.getValorPago());
            ps.setDouble(5,producao.getValorAPagar());
            ps.setString(6,producao.getMetodoDePagamento());
            ps.setString(7,producao.getDataEntrega());

            ps.execute();
            ps.close();

            conexao.close();

            System.out.println("Pedido salvo com sucesso.");

        }catch (SQLException e) {

            System.out.println("Falha ao salvar o pedido");

        }

        }

    public Producao pesquisar(Long id) throws SQLException {

        Connection conexao = null;

        String sql1 = "SELECT * FROM producao WHERE id=?";

        PreparedStatement ps1 = conexao.prepareStatement(sql1);

        ps1.setLong(1,1l);
        ResultSet resultSet = ps1.executeQuery();

        try{

            if (resultSet.next()) {

                Producao producaoPesquisado = new Producao();

                producaoPesquisado.setId(resultSet.getLong("id"));
                producaoPesquisado.setClienteId(resultSet.getLong("cliente_id"));
                producaoPesquisado.setPedido(resultSet.getString("pedido"));
                producaoPesquisado.setDataEntrega(resultSet.getString("data_entrega"));
                producaoPesquisado.setValor(resultSet.getDouble("valor"));
                producaoPesquisado.setValorPago(resultSet.getDouble("valor_pago"));
                producaoPesquisado.setValorAPagar(resultSet.getDouble("valor_a_pagar"));
                producaoPesquisado.setMetodoDePagamento(resultSet.getString("metodo_de_pagamento"));

                ps1.execute();

                conexao.close();

                return producaoPesquisado;
            }

        }catch (SQLException e){

            System.out.println("Busca de produção falhou");

        }
            //     return ? this need return bot return why
     }

    //Nesse bloco metodo pesquisar a partir do data de entrega do pedido

    public Producao pesquisar(String dataEntrega) throws SQLException {

        Connection conexao = null;

        String sql2 = "SELECT * FROM producao WHERE data_entrega=?";

        PreparedStatement ps2 = conexao.prepareStatement(sql2);

        ps2.setString(1,"");

        ResultSet resultSet1 = ps2.executeQuery();;

        try {

            if (resultSet1.next()) {

                Producao producaoPesquisado = new Producao();

                producaoPesquisado.setId(resultSet1.getLong("id"));
                producaoPesquisado.setClienteId(resultSet1.getLong("cliente_id"));
                producaoPesquisado.setPedido(resultSet1.getString("pedido"));
                producaoPesquisado.setDataEntrega(resultSet1.getString("data_entrega"));
                producaoPesquisado.setValor(resultSet1.getDouble("valor"));
                producaoPesquisado.setValorPago(resultSet1.getDouble("valor_pago"));
                producaoPesquisado.setValorAPagar(resultSet1.getDouble("valor_a_pagar"));
                producaoPesquisado.setMetodoDePagamento(resultSet1.getString("metodo_de_pagamento"));

                ps2.execute();

                conexao.close();

                return producaoPesquisado;
            }

        } catch (SQLException e) {

                System.out.println("Busca de produção falhou");

        }
        //     return ? this need return bot return why
    }
}
