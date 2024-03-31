public class Player {
    private String nom;
    private int pontuacao;
    private int level;
  
    public Jogador(String nom, int pontuacao, int level)
     {
        this.nom = nom;
        this.pontuacao = pontuacao;
        this.level = level;
    }
    
    public void aumentarPontuacao(int pontos) 
    {
        pontuacao += pontos;
    }
    
    public void subirLevel() 
    {
        level++;
    }
    
    public void exibirInfo() 
    {
        System.out.println("Nome do jogador: " + nom);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + level);
    }
}
