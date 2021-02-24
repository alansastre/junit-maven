package assumptions;

//import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;



public class AssumptionsTest {

    @Test
    void prueba1(){

        String destktop = System.getenv("DESKTOP_SESSION");
        assumeTrue("windows".equals(destktop));


        System.out.println("hola!!");
    }

}
