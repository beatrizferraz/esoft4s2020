package beatriz_ferraz.q_atividade20201122;

import javax.persistence.Entity;

@Entity
public class Funcionario extends BaseEntity {
    private String nome;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome) {
        this();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + "\n";
    }
}
