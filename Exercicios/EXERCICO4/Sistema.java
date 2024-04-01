public class Sistema
 {
    public static void main(String[] args)
     {
        Jogador playerUm = new player("Jennifer", 120, 9);

        playerUm.aumentarPontuacao(500);
        playerUm.subirLevel();

        playerUm.exibirInfo();
    }
}
