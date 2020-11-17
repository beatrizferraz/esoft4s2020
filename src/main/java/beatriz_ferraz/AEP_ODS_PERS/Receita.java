package beatriz_ferraz.AEP_ODS_PERS;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Receita {
    
    @Id
    private String id;
    private String titulo;
    private String texto;
    private List<PalavraChave> palavrasChave = new ArrayList<>(); 
    private PalavraChave palavraPesquisada; 
    private List<Avaliacao> avaliacao = new ArrayList<>(); 
    private Usuario autorDaReceita; 

    public Receita (String titulo, String texto) {
        
        id = UUID.randomUUID().toString();  
        setTitulo(titulo);
        setTexto(texto);
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
       if(titulo == null || titulo.trim().length() <= 1) {
          throw new RuntimeException("Título inválido.");
       }
       this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getAutorDaReceita() {
        return autorDaReceita;
    }

    public void addPalavraChave(PalavraChave novaPalavraChave) {
        this.palavrasChave.add(novaPalavraChave);
    }

    public void addAvaliacao(Avaliacao novaAvaliacao) {
        this.avaliacao.add(novaAvaliacao);
    }

    @Override
    public String toString() {
        String stringPalavrasChave = "Palavras-chave: ";
        for (PalavraChave p : this.palavrasChave) {
            stringPalavrasChave += p.toString() + "; ";
        }

        String stringAvaliacao = "\nAVALIACOES";
        for (Avaliacao a : this.avaliacao) {
             stringAvaliacao += a.toString() + "\n";
        }

        return "Título da Receita: " + titulo + "\n" 
                + "Texto: " + texto + "\n"
                + stringPalavrasChave.substring(0,stringPalavrasChave.length())
                + stringAvaliacao.substring(0,stringAvaliacao.length());
    }

    public void existemReceitasComEssaPalavraChave(PalavraChave palavraPesquisada) {
        boolean achouPalavra = false;
        for (PalavraChave p : this.palavrasChave) {
            final boolean palavraIgual = p.getPalavra().equals(palavraPesquisada.getPalavra());
            if(palavraIgual) {
                achouPalavra = true;
                System.out.println("Existem receitas relacionadas a " + palavraPesquisada + ".");
                break;
            } 
        }
        if(!achouPalavra) {
            throw new RuntimeException("Nenhum resultado encontrado.");
        }
        this.palavraPesquisada =  palavraPesquisada;
    }

    public PalavraChave getExistemReceitasComEssaPalavraChave() {
        return palavraPesquisada;
    }
}
