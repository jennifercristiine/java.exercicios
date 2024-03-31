import java.util.ArrayList;
import java.util.List;

public class Pedido 
{
    private List<Pizza> pizzas;

    public Pedido() 
    {
        pizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) 
    {
        pizzas.add(pizza);
    }

    public void removerPizza(Pizza pizza) 
    {
        pizzas.remove(pizza);
    }

    public double calcularValorTotal() 
    {
        double total = 0;
        for (Pizza pizza : pizzas) 
        {
            total += pizza.getValor();
        }
        return total;
    }
    
    public void gerarRelatorio() 
    {
        System.out.println("***** Relatório de Pedidos ******");
        System.out.println("Total de pizzas pedidas: " + pizzas.size());
        System.out.println("Valor total do pedido: R$" + calcularValorTotal());
    }
}
