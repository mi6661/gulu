package Bean.Event;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//通过注解来实现监听机制
@Component
public class ContextClosedAnnotationEventListener {

    @EventListener
    @Order(2)
    public void onEvent(ContextClosedEvent event) {
        System.out.println("[@EventListener]ApplicationContext closed.");
    }

}
