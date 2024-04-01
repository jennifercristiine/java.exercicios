public class Carro 
{
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;
    
    public Carro(String marca, String modelo, int ano, String placa, int velocidadeAtual) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar()
    {
        velocidadeAtual += 45;
    }

    public void frear() 
    {
        if (velocidadeAtual >= 45) 
        {
            velocidadeAtual -= 10;
        } else
        {
            velocidadeAtual = 0;
        }
    }
    
    public void exibirInfo()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}
