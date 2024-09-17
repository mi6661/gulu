package Bean.Event.EventPublisher;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


public class CustomEvent extends ApplicationEvent {
   public CustomEvent(Object source) {
       super(source);
   }
}
