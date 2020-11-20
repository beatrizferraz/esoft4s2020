package beatriz_ferraz.AEP_ODS_PERS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import beatriz_ferraz.AEP_ODS_PERS.receita.Avaliacao;
import beatriz_ferraz.AEP_ODS_PERS.receita.PalavraChave;
import beatriz_ferraz.AEP_ODS_PERS.receita.Receita;
import beatriz_ferraz.AEP_ODS_PERS.usuario.Usuario;
import beatriz_ferraz.AEP_ODS_PERS.receita.ReceitaService;
import beatriz_ferraz.AEP_ODS_PERS.usuario.UsuarioService;

@SpringBootApplication
public class AppCozinhaSustentavel implements CommandLineRunner  {
    @Autowired
    private ReceitaService receitaService;

    @Autowired
    private UsuarioService usuarioService;

    public static void main(String[] args) {
        
        SpringApplication.run(AppCozinhaSustentavel.class, args).close();;

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------- Receitas -------------------");
        //receitaService.criarReceitas();

        for (Receita r : receitaService.obterTodas()) {
            System.out.println("Receita: \n" + r.toString());
        }

        System.out.println("---------------- Usuarios -------------------");
        //usuarioService.criarUsuarios();

        for (Usuario u: usuarioService.obterTodos()) {
            System.out.println(u);
        }
    }   
}