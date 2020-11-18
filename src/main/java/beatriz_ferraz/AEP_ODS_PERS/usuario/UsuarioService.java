package beatriz_ferraz.AEP_ODS_PERS.usuario;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    private UsuarioRepository repo;

    public void criarUsuarios() {
        repo.save( new Usuario("Ana Elisa Borges","**********"));
        repo.save( new Usuario("Barbara Panini","*********"));
        repo.save( new Usuario("Clara Nunes de Albuquerque","**********"));
        repo.save( new Usuario("Guilherme Bitencourt","********"));
        repo.save( new Usuario("Matheus Oliveira","********"));
        repo.save( new Usuario("Rafael Koslowski","*********"));
    }

    public List<Usuario> obterTodos() {
		return repo.findAll();
	}
}
