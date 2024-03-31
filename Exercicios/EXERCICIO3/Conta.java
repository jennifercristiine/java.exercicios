public class Conta {
    private int numConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numConta, String nomeTitular, double SaldoInicial) 
    {
        this.numConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = SaldoInicial;
    }
    
    public void depositar(double valor) 
    {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
    
    public void sacar(double valor) 
    {
        if (valor > saldo) 
        {
            System.out.println("Saldo insuficiente para saque.");
        } else 
        {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }
    
    public double consultarSaldo() 
    {
        return saldo;
    }
}
