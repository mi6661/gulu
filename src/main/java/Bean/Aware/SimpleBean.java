package Bean.Aware;
import org.springframework.stereotype.Component;


@Component
public class SimpleBean {

    public void SayHello(){
        System.out.println("Hello world");
    }
}
