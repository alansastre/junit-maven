package parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CSVSourceTest {


    @ParameterizedTest
    @CsvSource({
            "Peter, admin, 1",
            "Juan, manager, 1",
            "Rauli, normal, 1",
            "Mike, admin, 1",
    })
    void printUser(String name, String role, Long id){
        System.out.println("Usuario name: " + name + ", role: " + role + ", id: " + id);
    }
}
