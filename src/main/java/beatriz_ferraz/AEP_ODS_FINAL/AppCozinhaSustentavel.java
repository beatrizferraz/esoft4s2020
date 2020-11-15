package beatriz_ferraz.AEP_ODS_FINAL;


public class AppCozinhaSustentavel {
    public static void main(String[] args) {
        
        Usuario novoUsuario = new Usuario("Ana Clara Damini", "********");
        
        Receita novaReceita = new Receita("Chips de casca de abóbora","[lorem ipsum etc]");
       
        PalavraChave abobora = new PalavraChave("abobora");
        PalavraChave casca = new PalavraChave("casca"); 
        Avaliacao novaAvaliacao = new Avaliacao("Ana Clara Damini",3,"Saborosos e sequinhos, mas pela grossa expessura da casca da abóbora, os chips ficam um pouco duros.");
        Avaliacao outraAvaliacao= new Avaliacao("Guilherme Bitencourt",4,"");


        novaReceita.addPalavraChave(abobora);
        novaReceita.addPalavraChave(casca);

        novaReceita.addAvaliacao(novaAvaliacao);
        novaReceita.addAvaliacao(outraAvaliacao);

        System.out.println("Testando apresentação de uma receita: ");
        System.out.println(novaReceita);

        System.out.println("\nTeste de pesquisa de palavra: ");
        novaReceita.existemReceitasComEssaPalavraChave(casca);

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nTestando usuário: ");
        System.out.println("Nome do usuário: " + novoUsuario.getNome()
                            + "\nSenha: " + novoUsuario.getSenha());   
    }
}