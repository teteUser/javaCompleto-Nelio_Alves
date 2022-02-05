package poo.ex82banco;

public class Conta {
    private int numConta;
    private String nomeTitular;
    private Double saldo = 0d;

    public Conta(int numConta) {
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
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", account.getNumConta(), account.getNomeTitular(), account.getSaldo());
    }

    public void sacar(Double quantia){
        this.saldo -= (quantia + 5.0);
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", account.getNumConta(), account.getNomeTitular(), account.getSaldo());
    }

}
