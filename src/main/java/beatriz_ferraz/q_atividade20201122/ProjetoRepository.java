package beatriz_ferraz.q_atividade20201122;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, String> {
    
    void save (LiderDeProjeto apontarLider);
}
