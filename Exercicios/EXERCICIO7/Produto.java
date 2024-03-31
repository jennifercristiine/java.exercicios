public class Produto 
{
    private String nome;
    private int codigo;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, int codigo, double preco, int quantidadeEstoque)
    {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public double getPreco() 
    {
        return preco;
    }

    public void setPreco(double preco) 
    {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() 
    {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) 
    {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) 
    {
        this.quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade)
    {
        if (this.quantidadeEstoque >= quantidade) 
        {
            this.quantidadeEstoque -= quantidade;
        } else 
        {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public double calcularValorTotal() 
    {
        return this.preco * this.quantidadeEstoque;
    }

    public void exibirInfo() 
    {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Valor total em estoque: R$" + calcularValorTotal());
    }
}
