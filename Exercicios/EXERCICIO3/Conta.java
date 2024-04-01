public class Conta {
    private int numConta;
    private String nomeTitular;
    private float saldo;

    public ContaBancaria(int numConta, String nomeTitular, float SaldoInicial) 
    {
        this.numConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = SaldoInicial;
    }
    
    public void depositar(float valor) 
    {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
    
    public void sacar(float valor) 
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
    
    public float consultarSaldo() 
    {
        return saldo;
    }
}
