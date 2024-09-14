package Bean.Lifecycle.UseXml;

public class Person {
    String name;
    String age;
    int id;
    public Person(){
        this.name = "null";
        this.age = "null";
    }
    public Person(String name, String age){
        this.name = name;
        this.age = age;
    }

    public void setID(int id){
        this.id = id;
    }
    public void Print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void init(){
        System.out.println("创建后的回调操作");
    }

    public void destroy(){
        System.out.println("销毁前的回调操作");
    }

}
