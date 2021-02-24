package names;

import java.util.stream.Stream;

public class NamesProvider {

    public static Stream<String> namesProvider() {
        return Stream.of("Juan","Antonio","Calamardo");
    }
}
