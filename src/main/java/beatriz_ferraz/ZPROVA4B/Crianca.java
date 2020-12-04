package beatriz_ferraz.ZPROVA4B;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Crianca extends BaseEntity{
    private String nome;

    @ManyToOne
    private Parque parque;

    @ManyToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Brinquedo> brinquedos = new HashSet<>();

    public Crianca() {
        super();
    }
    public Crianca(String nome) {
        this();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Parque getParque() {
        return parque;
    }

    public Set<Brinquedo> getBrinquedo() {
        return brinquedos;
    }

    public void addBrinquedo(Brinquedo brinquedo) {
        this.brinquedos.add(brinquedo);
    }

    @Override
    public String toString() {
        String stringBrinquedos = "Brinquedos: ";
        for(Brinquedo b: this.brinquedos) {
            stringBrinquedos += b.toString();
        }
        
        return "Crianca: " + nome + "\n"
                + stringBrinquedos.substring(0,stringBrinquedos.length()) + "\n";
    }
}
