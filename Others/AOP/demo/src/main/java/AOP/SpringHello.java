package AOP;

public class SpringHello implements Hello {
    @Override
    public void say(){
        System.out.println("Hello Spring");
    }
}
