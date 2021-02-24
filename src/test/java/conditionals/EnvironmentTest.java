package conditionals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnvironmentTest {

    @Test
    void printEnvironment(){
        System.getenv().forEach( (key, value) -> System.out.println(key + " - " + value));
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "DESKTOP_SESSION", matches = "ubuntu")
    void printOnlyInUbuntu(){
        System.out.println("hola");
    }
}
