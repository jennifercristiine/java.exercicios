public class Main 
{
    public static void main(String[] args) 
    {
        Contato contato = new Contato("Michele", "936677667");
        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato);
        
        Contato contatoEncontrado = agenda.buscarContatoPorNome("Michele");
        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado:");
            System.out.println("Nome: " + contatoEncontrado.getNome());
            System.out.println("Telefone: " + contatoEncontrado.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}
