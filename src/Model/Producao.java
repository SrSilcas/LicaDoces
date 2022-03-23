package model;

public class Producao {

    private long id;
    private long clienteId;
    private String pedido;
    private double valor;
    private double valorPago;
    private double valorAPagar;
    private String metodoDePagamento;
    private String dataEntrega;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClienteId() {
        return clienteId;
    }

    public void setClienteId(long clienteId) {
        this.clienteId = clienteId;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public String getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public String toString() {
        return "Producao{" +
                "id=" + id +
                ", clienteId=" + clienteId +
                ", pedido='" + pedido + '\'' +
                ", valor=" + valor +
                ", valorPago=" + valorPago +
                ", valorAPagar=" + valorAPagar +
                ", metodoDePagamento='" + metodoDePagamento + '\'' +
                ", dataEntrega='" + dataEntrega + '\'' +
                '}';
    }

}
