package beatriz_ferraz.q_atividade20201122;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProjetoService {
    @Autowired
    private ProjetoRepository repo;
   
    public void criarProjetos() {
        
        LiderDeProjeto l = new LiderDeProjeto("Silvia Brunelli");
        repo.save(l);
        Projeto p = new Projeto("Interface acessivel",l,"25/05/2020","15/12/2020");
        Funcionario f1 = new Funcionario("Maria Julia de Carvalho");
        p.addFuncionario(f1);
        repo.save(p);

        l= new LiderDeProjeto("Barbara Lima");
        repo.save(l);
        p = new Projeto("Interface para app infantil",l,"30/06/2020","18/12/2020");
        f1 = new Funcionario("Guilherme Oliveira Castro");
        p.addFuncionario(f1);
        Funcionario f2 = new Funcionario("Clarice Muncinelle");
        p.addFuncionario(f2);
        Funcionario f3 = new Funcionario("Ana Maria Alves");
        p.addFuncionario(f3);
        repo.save(p);

        l = new LiderDeProjeto("Sarah Gutierrez");
        repo.save(l);
        p = new Projeto("Banco de Dados noSQL",l,"05/07/2020","31/01/2021");
        f1 = new Funcionario("Laura de Almeida Oliveira");
        p.addFuncionario(f1);
        f2 = new Funcionario("Guilherme Oliveira Castro");
        p.addFuncionario(f2);
        f3 = new Funcionario("Igor Albuquerque");
        p.addFuncionario(f3);
        Funcionario f4 = new Funcionario("Natalia Machado Damiani");
        p.addFuncionario(f4);
        repo.save(p);
    }

    public List<Projeto> getAll() {
        return repo.findAll();
    }
    
}
