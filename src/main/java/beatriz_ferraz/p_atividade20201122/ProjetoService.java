package beatriz_ferraz.p_atividade20201122;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProjetoService {
    @Autowired
    private ProjetoRepository repo;
    private LiderDeProjeto l;

    public void apontarLider() {
        l = new LiderDeProjeto("Barbara Lima");
        repo.save(l);
    }

    public void criarProjetos() {
        Projeto p = new Projeto("Interface acessivel",l,"25/05/2020","15/12/2020");
        Funcionario f = new Funcionario("Maria Julia de Carvalho");
        // Funcionario f2 = new Funcionario("Guilherme Oliveira Castro");
        // Funcionario f3 = new Funcionario("Clarice Muncinelle");
        p.addFuncionario(f);
        // p.addFuncionario(f2);
        // p.addFuncionario(f3);
        repo.save(p);
    }

    public List<Projeto> getAll() {
        return repo.findAll();
    }
    
}
