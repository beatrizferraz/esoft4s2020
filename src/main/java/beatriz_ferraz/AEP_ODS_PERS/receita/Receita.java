package beatriz_ferraz.AEP_ODS_PERS.receita;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import beatriz_ferraz.AEP_ODS_PERS.usuario.Usuario;
import beatriz_ferraz.AEP_ODS_PERS.BaseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Entity
public class Receita extends BaseEntity{

    private String titulo;
    private String texto;
    // private PalavraChave palavraPesquisada;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<PalavraChave> palavrasChave = new HashSet<>(); 
     
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Avaliacao> avaliacao = new HashSet<>(); 
    
    // @OneToOne
    // private Usuario autorDaReceita; 

    public Receita() {
        super();
    }
    
    public Receita (String titulo, String texto) {
        this();
        setTitulo(titulo);
        setTexto(texto);
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

    // public Usuario getAutorDaReceita() {
    //     return autorDaReceita;
    // }

    public Set<PalavraChave> getPalavraChave() {
        return palavrasChave;
    }

    public Set<Avaliacao> getAvaliacoes() {
        return avaliacao;
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

        String stringAvaliacao = "\n";
        for (Avaliacao a : this.avaliacao) {
             stringAvaliacao += a.toString() + "\n";
        }

        return "Título da Receita: " + titulo + "\n" 
                + "Texto: " + texto + "\n"
                + stringPalavrasChave.substring(0,stringPalavrasChave.length())
                + stringAvaliacao.substring(0,stringAvaliacao.length());
    }

    // public void existemReceitasComEssaPalavraChave(PalavraChave palavraPesquisada) {
    //     boolean achouPalavra = false;
    //     for (PalavraChave p : this.palavrasChave) {
    //         final boolean palavraIgual = p.getPalavra().equals(palavraPesquisada.getPalavra());
    //         if(palavraIgual) {
    //             achouPalavra = true;
    //             System.out.println("Existem receitas relacionadas a " + palavraPesquisada + ".");
    //             break;
    //         } 
    //     }
    //     if(!achouPalavra) {
    //         throw new RuntimeException("Nenhum resultado encontrado.");
    //     }
    //     this.palavraPesquisada =  palavraPesquisada;
    // }

    // public PalavraChave getExistemReceitasComEssaPalavraChave() {
    //     return palavraPesquisada;
    // }
}
