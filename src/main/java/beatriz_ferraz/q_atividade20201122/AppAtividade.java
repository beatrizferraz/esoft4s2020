package beatriz_ferraz.q_atividade20201122;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppAtividade implements CommandLineRunner  {
    @Autowired
    private ProjetoService projetoService;


    public static void main(String[] args) {
        SpringApplication.run(AppAtividade.class, args).close();;    
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------- Projetos -------------------");
        projetoService.criarProjetos();

        for (Projeto p : projetoService.getAll()) {
            System.out.println(p.toString());
        }
    }   
}
