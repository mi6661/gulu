package Bean.Processor;

import jakarta.annotation.PostConstruct;

public class Hello {
    @PostConstruct
    public void init() {
        System.out.println("Hello PostProcessor@");
    }

    public String hello(){
        return "Hello World";
    }
}
