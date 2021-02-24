package conditionals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JRETest {

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void runOnlyOnJava8(){
        System.out.println("Hola mundo desde Java 8");
    }

    @Test
    @DisabledOnJre(JRE.JAVA_15)
    void runOnlyOnJava15(){
        System.out.println("Hola mundo desde Java 15");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_11)
    void runOnlyOnJavaRange9to11(){
        System.out.println("Hola mundo desde Java 15");
    }
}
