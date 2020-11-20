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

        Receita r = new Receita("Bolo de casca de banana","[lorem ipsum]");
        PalavraChave p = new PalavraChave("banana");
        r.addPalavraChave(p);
        Avaliacao a = new Avaliacao("Ana Elisa Borges",5,"Excelente receita.");
        r.addAvaliacao(a);
        repo.save(r);

        r = new Receita("Geleia de casca de abacaxi","[lorem ipsum]");
        p = new PalavraChave("abacaxi");
        r.addPalavraChave(p);
        repo.save(r);  

        r = new Receita("Bolinho de talos","[lorem ipsum]");
        p = new PalavraChave("talos");
        r.addPalavraChave(p);
        repo.save(r);

        r = new Receita("Doce de casca de limao","[lorem ipsum]");
        p = new PalavraChave("limao");
        r.addPalavraChave(p);
        repo.save(r);

        r = new Receita("Doce de casca de laranja","[lorem ipsum]");
        p = new PalavraChave("laranja");
        r.addPalavraChave(p);
        a = new Avaliacao("Guilherme Bitencourt",5,"Otima receita.");
        r.addAvaliacao(a);
        repo.save(r);
    }

    public List<Receita> obterTodas() {
		return repo.findAll();
	}

}
