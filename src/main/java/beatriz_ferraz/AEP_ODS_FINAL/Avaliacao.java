package beatriz_ferraz.AEP_ODS_FINAL;

import java.util.UUID;

public class Avaliacao {
    
    private String id;
    private int nota;
    private String comentario;
    private String autorDaAvaliacao;

    public Avaliacao(String autorDaAvaliacao, int nota, String comentario) {
        id = UUID.randomUUID().toString();
        setNota(nota);
        setComentario(comentario);
        
        this.autorDaAvaliacao = autorDaAvaliacao;
    }

    public String getId() {
        return id;
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

