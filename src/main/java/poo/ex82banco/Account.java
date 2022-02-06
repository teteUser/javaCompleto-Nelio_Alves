package poo.ex82banco;

public class Account {
    private int numConta;
    private String nomeTitular;
    private Double saldo = 0d;

    public Account(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double quantia){
        this.saldo += quantia;
    }

    public void sacar(Double quantia){
        this.saldo -= (quantia + 5.0);

    }

    public void toStringVoid() {
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", this.getNumConta(), this.getNomeTitular(), this.getSaldo());
    }
}
