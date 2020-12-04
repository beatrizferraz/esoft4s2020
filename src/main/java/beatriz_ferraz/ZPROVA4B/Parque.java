package beatriz_ferraz.ZPROVA4B;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Parque extends BaseEntity {
    private String nomeDoParque;

    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Crianca> criancas = new HashSet<>();
    
    public Parque() {
        super();
    }

    public Parque(String nomeDoParque) {
        this();
        this.nomeDoParque = nomeDoParque;
    }

    public String getNomeDoParque() {
        return nomeDoParque;
    }

    public Set<Crianca> getCrianca() {
        return criancas;
    }

    public void addCrianca(Crianca crianca) {
        this.criancas.add(crianca);
    }

    @Override
    public String toString() {
        String stringCriancas = "Criancas no parque: \n";
        for(Crianca c: this.criancas) {
            stringCriancas += c.toString();
        }
        
        return "Nome do parque: " + nomeDoParque + "\n"
                + stringCriancas.substring(0,stringCriancas.length());
    }
}

