package beatriz_ferraz.AEP_ODS_PERS.receita;

import javax.management.RuntimeErrorException;
import javax.persistence.Entity;

import beatriz_ferraz.AEP_ODS_PERS.BaseEntity;

@Entity
public class PalavraChave extends BaseEntity{
    
    private String palavra;

    public PalavraChave() {
        super();
    }
    
    public PalavraChave(String palavra) {
        this();
        setPalavra(palavra);
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        if(palavra == null || palavra.trim().length() <= 1) {
           throw new RuntimeException("Não configura uma palavra.");
        }
        this.palavra = palavra;
    }

    @Override
    public String toString() {
        return palavra;
    }
}
