package beatriz_ferraz.ZPROVA4B;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParqueRepository extends JpaRepository<Parque, String> {

	void save(Brinquedo b);   
}
