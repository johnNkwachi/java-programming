import java.util.Objects;

public class HelloWorld {

    public String printHelloWorld(String helloWorld){
        if (!Objects.equals(helloWorld, "Hello World")){
            System.out.println("Please re-enter hello world");
        }

        return helloWorld;
    }
}
