package beatriz_ferraz.AEP_ODS_PERS.receita;

import javax.persistence.Entity;

import beatriz_ferraz.AEP_ODS_PERS.BaseEntity;

@Entity
public class Avaliacao extends BaseEntity {
       
    private int nota;
    private String comentario;
    private String autorDaAvaliacao;

    public Avaliacao() {
        super();
    }
    
    public Avaliacao(String autorDaAvaliacao, int nota, String comentario) {
        this();
        setNota(nota);
        setComentario(comentario);
        
        this.autorDaAvaliacao = autorDaAvaliacao;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if(nota < 1 || nota > 5) {
            throw new RuntimeException("Nota deve ser entre 1 e 5.");
        }
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        if(comentario.length() > 1000) {
            throw new RuntimeException("Comentário não deve ultrapassar 1000 caracteres.");
        }
        this.comentario = comentario;
    }

    @Override
    public String toString() {
       
        if (comentario == null || comentario.trim().length() == 0) {
            return "\nUsuario - " + autorDaAvaliacao
                    + "\nNota: " + String.valueOf(nota) + " estrelas. \n";
        }
        else { 
            return  "\nUsuario - " + autorDaAvaliacao
                    + "\nNota: " + String.valueOf(nota) + " estrelas. \n"
                    + "Comentario: " + comentario;
        }
        
    }
}

