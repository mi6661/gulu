package Bean.Event.EventPublisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

//生产事件的CustomEventPublisher类



@Component
public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    public void fire(){
        publisher.publishEvent(new CustomEvent("Hello"));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher){
        this.publisher = applicationEventPublisher;
    }

}
