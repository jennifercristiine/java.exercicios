public class Main 
{
    public static void main(String[] args) 
    {
        Produto arroz = new Produto("Arroz", 1, 5.99, 50);
        Produto feijao = new Produto("Feijão", 2, 8.99, 30);

        arroz.adicionarEstoque(20);

        feijao.removerEstoque(10);

        arroz.exibirInfo();
        System.out.println("//------------//-------------//");
        feijao.exibirInfo();
    }
}
