package beatriz_ferraz.q_atividade20201122;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class LiderDeProjeto extends BaseEntity {
    private String nome;

    @OneToOne
    private Projeto projeto;

    public LiderDeProjeto() {
        super();
    }

    public LiderDeProjeto(String nome) {
        this();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    @Override
    public String toString() {
        return nome;
    }
}
