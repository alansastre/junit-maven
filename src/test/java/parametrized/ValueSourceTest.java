package parametrized;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourceTest {


    @ParameterizedTest
    @ValueSource(strings = {"Alan", "Juanma", "Sergio", "Mónica"})
    void listNames(String name){

    }

    @ParameterizedTest(name = "{index} - Prueba con argumento={arguments}")
    @ValueSource(ints = {5, 10, 15, 20})
    void listNumbers(int num){
        System.out.println(num);
    }

    @ParameterizedTest(name = "{index} - Prueba con argumento={arguments}")
    @ValueSource(doubles = {5, 10, 15, 20})
    void dynamicCalculator(double num, double result){

        
    }
}
