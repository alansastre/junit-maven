package conditionals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class SystemPropertiesTest {

    @Test
    void printSystemProperties(){
        System.getProperties().forEach(
                (key, value) -> System.out.println(key + " - " + value) );
    }

    @Test
    @EnabledIfSystemProperty(named="user.name", matches = "sdfdsfs")
    void runOnlyOnUserName(){
        System.out.println("Java Oracle");
    }

    @Test
    @EnabledIfSystemProperty(named="os.arch", matches = "amd64")
    void runOnlyOnOsArch(){
        System.out.println("Java Oracle");
    }

    @RunOnlyOnLinux
    void checkLinux(){
        System.out.println("Estamos Linux!!!");
    }

}
