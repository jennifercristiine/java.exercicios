public class Sistema {
    public static void main(String[] args) 
    {
        ContaBancaria Conta = new ContaBancaria(123987, "Henrique", 2002.1);

        Conta.depositar(900.0);
        Conta.sacar(50.1);
        
        double saldoAtual = Conta.consultarSaldo();
        System.out.println("Saldo atual: R$" + saldoAtual);
    }
}
