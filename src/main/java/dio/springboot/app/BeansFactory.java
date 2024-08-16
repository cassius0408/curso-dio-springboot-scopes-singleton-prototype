package dio.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansFactory {

    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("CRIANDO UM OBJETO REMETENTE.");
        Remetente remetente = new Remetente();
        remetente.setNome("Digital Inovation One.");
        remetente.setEmail("noreply@dio.com.br");
        return remetente;
    }

}
