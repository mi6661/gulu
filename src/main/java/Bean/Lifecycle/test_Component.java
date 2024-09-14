package Bean.Lifecycle;



public class test_Component {
    public void Hello() {
        System.out.println("Hello");
    }


    public void init(){
        System.out.println("I am init function1234");
    }

    public void destroy(){
        System.out.println("I am destroy function");
    }
}
