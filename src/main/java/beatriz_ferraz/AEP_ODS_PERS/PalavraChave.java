package beatriz_ferraz.AEP_ODS_PERS;

import java.util.UUID;

import javax.management.RuntimeErrorException;

public class PalavraChave {
    
    private String id;
    private String palavra;

    public PalavraChave(String palavra) {
        id = UUID.randomUUID().toString();
        setPalavra(palavra);
    }

    public String getId() {
        return id;
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
