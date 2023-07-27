public class ContaBancaria {
    private String nomeCompleto;
    private float saldo;

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        this.saldo = 100;
    }
}
