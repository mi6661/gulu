package Bean.Close;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan("Bean.Close")
public class Configs {
    @Bean
    public Hellos hellos() {
        return new Hellos();
    }
}
