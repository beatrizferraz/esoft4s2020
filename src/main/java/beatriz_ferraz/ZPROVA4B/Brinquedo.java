package beatriz_ferraz.ZPROVA4B;

import javax.persistence.Entity;

@Entity
public class Brinquedo extends BaseEntity {
    private String nomeDoBrinquedo;


    public Brinquedo() {
        super();
    }

    public Brinquedo(String nomeDoBrinquedo) {
        this();
        this.nomeDoBrinquedo = nomeDoBrinquedo;
    }

    public String getNomeDoBrinquedo() {
        return nomeDoBrinquedo;
    }

    @Override
    public String toString() {
        return nomeDoBrinquedo;
    }
}
