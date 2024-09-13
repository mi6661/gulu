package Bean.Second;
import org.springframework.stereotype.Component;

@Component("Bean_test")
public class Test {

    public Test(){
        System.out.println("Test");
    }

    public void Speak(){
        System.out.println("你成功了，小伙子");
    }
}
