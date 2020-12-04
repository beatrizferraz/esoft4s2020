package beatriz_ferraz.ZPROVA4B;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppProva implements CommandLineRunner  {
    @Autowired
    private ParqueService parqueService;


    public static void main(String[] args) {
        SpringApplication.run(AppProva.class, args).close();;    
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------- Como estão os parques hoje -------------------");
        parqueService.saveParque();

        for (Parque p : parqueService.getAll()) {
            System.out.println(p.toString());
        }
    }   
}
