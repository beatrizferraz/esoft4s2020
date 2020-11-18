package beatriz_ferraz.AEP_ODS_PERS.receita;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ReceitaService {
    @Autowired
    private ReceitaRepository repo;

    public void criarReceitas() {
        repo.save(new Receita("Bolo de casca de banana","[lorem ipsum]")); 
        repo.save(new PalavraChave("banana"));  
        repo.save(new Receita("Torta de folhas de cenoura","[lorem ipsum]")); 
        repo.save(new PalavraChave("cenoura"));  
    }

    // public void criarPalavrasChave() {
    //     repo.save(new PalavraChave("banana")); 
    // }

    public void criarAvaliacoes() {
        repo.save(new Avaliacao("Barbara Panini", 5, "Excelente receita.")); 
    }

    public List<Receita> obterTodas() {
		return repo.findAll();
	}

}
