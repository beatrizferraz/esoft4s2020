package beatriz_ferraz.AEP_ODS_PERS;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, String> {

	void save(PalavraChave palavraChave);

	void save(Avaliacao avaliacao);
 
}
