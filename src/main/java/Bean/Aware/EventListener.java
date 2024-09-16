package Bean.Aware;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;
@Component
@Order(1)
public class EventListener implements ApplicationListener<ContextClosedEvent> {


    @Override
    public void onApplicationEvent(ContextClosedEvent event){
        System.out.println("Aware的Context被关闭了");
    }
}


@Component
class AnnotationListener{
    @org.springframework.context.event.EventListener
    @Order(2)
    public void onEvent(ContextClosedEvent event){
        System.out.println("Aware_Annotation_Listener");
    }
}
