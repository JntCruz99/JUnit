import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void ValidarAlgoSomenteNoUsuarioJonatas() {
        Assumptions.assumeTrue("Jonatas".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
