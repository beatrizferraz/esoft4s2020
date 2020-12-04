package beatriz_ferraz.ZPROVA4B;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ParqueService {
    @Autowired
    private ParqueRepository repo;
   
    public void saveParque() {
        
        Parque p = new Parque("Ibirapuera");
        Crianca c1 = new Crianca("Ana");
        p.addCrianca(c1);
        Crianca c2 = new Crianca("Maria");
        p.addCrianca(c2);
        Crianca c3 = new Crianca("Joao");
        p.addCrianca(c3);
        Brinquedo b = new Brinquedo ("Bola");
        c1.addBrinquedo(b);
        repo.save(p);

        
        p = new Parque("Parque do Carmo");
        c1 = new Crianca("Julia");
        p.addCrianca(c1);
        c2 = new Crianca("Rafael");
        p.addCrianca(c2);
        c3 = new Crianca("Alice");
        p.addCrianca(c3);
        b = new Brinquedo ("Pipa");
        c1.addBrinquedo(b);
        c2.addBrinquedo(b);
        c3.addBrinquedo(b);
        repo.save(p);
    }

    public List<Parque> getAll() {
        return repo.findAll();
    }
    
}
