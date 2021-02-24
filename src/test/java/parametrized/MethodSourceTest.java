package parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MethodSourceTest {


    private static Stream<String> namesProvider() {
        return Stream.of("Juan","Antonio","Calamardo");
    }

    @ParameterizedTest
    @MethodSource("namesProvider")
    void testNames(String name){
        System.out.println(name);
    }

    @ParameterizedTest
    @MethodSource("names.NamesProvider#namesProvider")
    void testNamesFromOtherClass(String name){
        System.out.println(name);
    }
}
