package dao;

import model.Producao;
import utils.JDBCultil;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
