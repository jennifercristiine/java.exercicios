public class Biblioteca {
    public static void main(String[] args) 
    {
        Livro livro1 = new Livro("O poder do Hábito", "Charles Duhigg", 2012);
        Livro livro2 = new Livro("A sutil arte de ligar o F***-Se", "Mark Manson", 2019);
        Livro livro3 = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1998);
        
        System.out.println("Informações do Livro 1:");
        livro1.exibirInfo();
        
        System.out.println("\nInformações do Livro 2:");
        livro2.exibirInfo();
        
        System.out.println("\nInformações do Livro 3:");
        livro3.exibirInfo();
    }
}
