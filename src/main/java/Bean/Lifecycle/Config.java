package Bean.Lifecycle;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan("Bean.Lifecycle")
public class Config {

    @Bean(name="life_first",initMethod="init",destroyMethod="destroy")
    public test_Component getTestComponent() {
        return new test_Component();
    }

    @Bean(name="life_second",initMethod = "init",destroyMethod="destroy")
    public second_Component getSecondComponent(){
        return new second_Component();
    }
}
