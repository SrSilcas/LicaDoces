package model;

public class Cliente {

    private long id;
    private String nome;
    private int numero;
    private String bairroEntrega1;
    private String bairroEntrega2;
    private String bairroEntrega3;
    private String bairroEntrega4;
    private String bairroEntrega5;
    private String dataAniversario;
    private String dataAniversarioParente;
    private String dataAniversarioParente2;

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numero=" + numero +
                ", bairroEntrega1='" + bairroEntrega1 + '\'' +
                ", bairroEntrega2='" + bairroEntrega2 + '\'' +
                ", bairroEntrega3='" + bairroEntrega3 + '\'' +
                ", bairroEntrega4='" + bairroEntrega4 + '\'' +
                ", bairroEntrega5='" + bairroEntrega5 + '\'' +
                ", dataAniversario='" + dataAniversario + '\'' +
                ", dataAniversarioParente='" + dataAniversarioParente + '\'' +
                ", dataAniversarioParente2='" + dataAniversarioParente2 + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairroEntrega1() {
        return bairroEntrega1;
    }

    public void setBairroEntrega1(String bairroEntrega1) {
        this.bairroEntrega1 = bairroEntrega1;
    }

    public String getBairroEntrega2() {
        return bairroEntrega2;
    }

    public void setBairroEntrega2(String bairroEntrega2) {
        this.bairroEntrega2 = bairroEntrega2;
    }

    public String getBairroEntrega3() {
        return bairroEntrega3;
    }

    public void setBairroEntrega3(String bairroEntrega3) {
        this.bairroEntrega3 = bairroEntrega3;
    }

    public String getBairroEntrega4() {
        return bairroEntrega4;
    }

    public void setBairroEntrega4(String bairroEntrega4) {
        this.bairroEntrega4 = bairroEntrega4;
    }

    public String getBairroEntrega5() {
        return bairroEntrega5;
    }

    public void setBairroEntrega5(String bairroEntrega5) {
        this.bairroEntrega5 = bairroEntrega5;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getDataAniversarioParente() {
        return dataAniversarioParente;
    }

    public void setDataAniversarioParente(String dataAniversarioParente) {
        this.dataAniversarioParente = dataAniversarioParente;
    }

    public String getDataAniversarioParente2() {
        return dataAniversarioParente2;
    }

    public void setDataAniversarioParente2(String dataAniversarioParente2) {
        this.dataAniversarioParente2 = dataAniversarioParente2;
    }
}
