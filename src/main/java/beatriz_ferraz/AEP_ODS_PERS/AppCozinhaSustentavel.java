package beatriz_ferraz.AEP_ODS_PERS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
        receitaService.criarReceitas();
        receitaService.criarPalavrasChave();
        receitaService.criarAvaliacoes();

        for (Receita r : receitaService.obterTodas()) {
            System.out.println(r);
        }


        System.out.println("---------------- Usuarios -------------------");
        usuarioService.criarUsuarios();

        for (Usuario u: usuarioService.obterTodos()) {
            System.out.println(u);
        }
    }   
}